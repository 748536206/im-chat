package com.instant.tio.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.instant.entity.UserInfo;
import com.instant.service.UserService;
import com.instant.tio.packet.ImReceiveBody;
import com.instant.tio.packet.ImyimConst;
import com.instant.tio.packet.MsgType;
import com.instant.tio.service.ImAnalysisService;
import com.instant.tio.service.ImSendService;
import com.instant.util.UserUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tio.core.ChannelContext;
import org.tio.utils.json.Json;
import org.tio.websocket.common.WsResponse;

import java.util.Date;

@Service
public class ImAnalysisServiceImpl implements ImAnalysisService {
    private static Logger logger = LoggerFactory.getLogger(ImAnalysisServiceImpl.class);
    @Autowired
    private ImSendService imSendService;
    @Autowired
    private UserService userService;

    /**
     * 消息体解析
     *
     * @return
     */
    public void convertToClientMsgBody(String text, ChannelContext channelContext, ImReceiveBody imReceiveBody) {
        String toId = "";
        String masg = "";
        UserInfo userInfo = userService.selectUserInfo(Integer.parseInt(channelContext.userid));
        toId = String.valueOf(imReceiveBody.getToid());
        //好友消息处理
        //获取消息处理器
        JSONObject masgBody = new JSONObject();
        masgBody.put("content", imReceiveBody.getContent());
        masgBody.put("timestamp", new Date().getTime());
        masgBody.put("username", userInfo.getUsername());
        masgBody.put("avatar", userInfo.getAvatar());
        if (ImyimConst.FRIEND == imReceiveBody.getMtype()) {
            masgBody.put("id", channelContext.userid);
            masgBody.put("type", ImyimConst.CHAT_TYPE_FRIEND);
            masgBody.put("mtype", MsgType.CLIENT_TO_CLIENT);
            masg = String.valueOf(masgBody);
            WsResponse wsResponse = WsResponse.fromText(masg, MsgType.CHARSET);
            if (StringUtils.isNoneBlank(masg)) {
                imSendService.sendToUser(channelContext, toId, wsResponse);
            }
        }
        if (ImyimConst.GROUP == imReceiveBody.getMtype()) {
            masgBody.put("id", imReceiveBody.getToid());
            masgBody.put("type", ImyimConst.CHAT_TYPE_GROUP);
            masgBody.put("mtype", MsgType.CLIENT_TO_GROUP);
            masgBody.put("from", channelContext.userid);
            masg = String.valueOf(masgBody);
            WsResponse wsResponse = WsResponse.fromText(masg, MsgType.CHARSET);
            if (StringUtils.isNoneBlank(masg)) {
                imSendService.sendToGroup(channelContext, toId, wsResponse);
            }
        }
    }
}
