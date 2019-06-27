package com.instant.tio;

import com.instant.entity.ImFriends;
import com.instant.entity.ImUserGroups;
import com.instant.entity.ImUserGroupstouser;
import com.instant.entity.UserInfo;
import com.instant.service.ImFriendsService;
import com.instant.service.ImUserGroupsService;
import com.instant.service.UserService;
import com.instant.tio.packet.*;
import com.instant.tio.service.ImAnalysisService;
import com.instant.util.SpringUtils;
import com.instant.util.TokenVerify;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.core.Tio;
import org.tio.http.common.HttpRequest;
import org.tio.http.common.HttpResponse;
import org.tio.http.common.HttpResponseStatus;
import org.tio.utils.json.Json;
import org.tio.websocket.common.WsRequest;
import org.tio.websocket.common.WsResponse;
import org.tio.websocket.server.handler.IWsMsgHandler;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;

public class MyWebSocketMsgHandler implements IWsMsgHandler {
    private static Logger logger = LoggerFactory.getLogger(MyWebSocketMsgHandler.class);
    private UserService userService = SpringUtils.getBean(UserService.class);
    private ImUserGroupsService imUserGroupsService = SpringUtils.getBean(ImUserGroupsService.class);
    private ImFriendsService imFriendsService = SpringUtils.getBean(ImFriendsService.class);
    private ImAnalysisService imAnalysisService = SpringUtils.getBean(ImAnalysisService.class);

    @Override
    public HttpResponse handshake(HttpRequest httpRequest, HttpResponse httpResponse, ChannelContext channelContext) throws Exception {
        String path = httpRequest.getRequestLine().getPath();
        String token = URLDecoder.decode(path.substring(1), "utf-8");
        String userId = TokenVerify.IsValid(token);
        logger.info("-----------handshake------------" + ":" + userId);
        if (userId == null) {
            //没有token 未授权
            httpResponse.setStatus(HttpResponseStatus.C401);
        } else {
            int uid = Integer.parseInt(userId);
            //解析token
            UserInfo userInfo = userService.selectUserInfo(uid);
            if (userInfo == null) {
                //没有找到用户
                httpResponse.setStatus(HttpResponseStatus.C404);
            } else {
                channelContext.setAttribute(userId, userInfo);
                //绑定用户ID
                Tio.bindUser(channelContext, userId);
                //绑定用户群组
                List<ImUserGroupstouser> imUserGroupstouserList = imUserGroupsService.selectHaveUserGroups(Integer.parseInt(userId));
                //绑定用户群信息
                if (null != imUserGroupstouserList && imUserGroupstouserList.size() > 0) {
                    for (ImUserGroupstouser imUserGroupstouser : imUserGroupstouserList) {
                        Tio.bindGroup(channelContext, String.valueOf(imUserGroupstouser.getUgGroupid()));
                    }
                }
                //通知所有好友本人上线了
                notify(channelContext, true);
            }
        }
        return httpResponse;
    }

    /**
     * 通知该用户的好友上线消息
     */
    private void notify(ChannelContext channelContext, boolean online) throws IOException {
        int uid = Integer.parseInt(channelContext.userid);
        //获取用户所有的好友ID
        List<ImFriends> imFriendsList = imFriendsService.selectFriends(uid);
        if (null == imFriendsList || imFriendsList.size() == 0) {
            return;
        }
        //构建消息体
        ImToClientOnlineStatusMsgBody msgBody = new ImToClientOnlineStatusMsgBody(uid, online);
        WsResponse statusPacket = BodyConvert.getInstance().convertToTextResponse(msgBody);
        //调用sendToAll的方法
        Tio.sendToAll(channelContext.getGroupContext(), statusPacket, filterChannelContext -> {
            //筛选掉已经移除和关闭的连接
            if (filterChannelContext.isRemoved || filterChannelContext.isClosed) {
                return false;
            }
            //筛选掉非当前用户好友的连接
            String channelContextUserid = filterChannelContext.userid;
            boolean exists = imFriendsList.stream().anyMatch(friendUserId ->
                    friendUserId.equals(channelContextUserid));
            return exists;
        });
    }


    /**
     * 握手成功
     */
    @Override
    public void onAfterHandshaked(HttpRequest httpRequest, HttpResponse httpResponse, ChannelContext channelContext) throws Exception {
        logger.info("---------------------------握手成功---------------------------");
    }

    /**
     * 接收到bytes消息
     */
    @Override
    public Object onBytes(WsRequest wsRequest, byte[] bytes, ChannelContext channelContext) throws Exception {
        logger.info("---------------------------接收到bytes消息---------------------------");
        return null;
    }


    @Override
    public Object onClose(WsRequest wsRequest, byte[] bytes, ChannelContext channelContext) throws Exception {
        logger.info("---------------------------onClose---------------------------");
        notify(channelContext, false);
        Tio.remove(channelContext, "onClose");
        return null;
    }

    /**
     * 接收到文本消息
     */
    @Override
    public Object onText(WsRequest wsRequest, String text, ChannelContext channelContext) throws Exception {
        //解析数据消息
        logger.info("-----------------收到消息-----------------:" + text);
        ImReceiveBody imReceiveBody = Json.toBean(text, ImReceiveBody.class);
        if (null != imReceiveBody && StringUtils.isNoneBlank(imReceiveBody.getContent())) {
            //处理消息体
            imAnalysisService.convertToClientMsgBody(text, channelContext, imReceiveBody);
        }
        return null;
    }
}
