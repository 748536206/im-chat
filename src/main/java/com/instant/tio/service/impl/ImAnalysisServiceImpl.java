package com.instant.tio.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.instant.entity.UserInfo;
import com.instant.service.UserService;
import com.instant.tio.packet.ImReceiveBody;
import com.instant.tio.packet.ImyimConst;
import com.instant.tio.packet.MsgType;
import com.instant.tio.service.ImAnalysisService;
import com.instant.tio.service.ImSendService;
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
    public void convertToClientMsgBody(String text, ChannelContext channelContext) {
        String toId = "";
        String masg = "";
        //解析数据消息
        logger.info("LayimServerAioHandler:解析消息类型:" + text);
        ImReceiveBody imReceiveBody = Json.toBean(text, ImReceiveBody.class);
        UserInfo userInfo = userService.selectUserInfo(Integer.parseInt(channelContext.userid));
        if (ImyimConst.HAND_SHAKE == (imReceiveBody.getMtype())) {
            return;
        }
        if (null != imReceiveBody) {
            toId = String.valueOf(imReceiveBody.getToid());
        }
        //获取消息处理器
        JSONObject masgBody = new JSONObject();
        masgBody.put("id", userInfo.getUid());
        masgBody.put("content", imReceiveBody.getContent());
        masgBody.put("timestamp", new Date().getTime());
        masgBody.put("username", userInfo.getUsername());
        masgBody.put("avatar", userInfo.getAvatar());
        masgBody.put("type", ImyimConst.CHAT_TYPE_FRIEND);
        masgBody.put("mtype", MsgType.CLIENT_TO_CLIENT);
        masg = String.valueOf(masgBody);
        if (StringUtils.isNoneBlank(masg)) {
            WsResponse wsResponse = WsResponse.fromText(masg, MsgType.CHARSET);
            imSendService.sendToUser(channelContext, toId, wsResponse);
        }
    }
}
