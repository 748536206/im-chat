package com.instant.tio.service.impl;

import com.instant.tio.service.ImSendService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.tio.core.ChannelContext;
import org.tio.core.Tio;
import org.tio.core.intf.Packet;

@Service
public class ImSendServiceImpl implements ImSendService {
    private static Logger logger = LoggerFactory.getLogger(ImSendServiceImpl.class);

    /**
     * 发送单聊消息(Tio.sendToUser 返回true代表好友在线  返回false 代表好友不在线)
     * @param channelContext
     * @param userid
     * @param packet
     */
    @Override
    public void sendToUser(ChannelContext channelContext, String userid, Packet packet) {
        try {
           boolean state = Tio.sendToUser(channelContext.groupContext, userid, packet);
           if (state) {
               logger.info("-----------好友在线-------------");
           }else {
               logger.info("-----------好友离线-------------");
           }
        } catch (Exception e) {
            logger.info("--------------消息发送失败------------"+e);
        }
    }

    /**
     * 发送群聊消息
     * @param channelContext
     * @param guid
     * @param packet
     */
    @Override
    public void sendToGroup(ChannelContext channelContext, String guid, Packet packet) {
        try {
            Tio.sendToGroup(channelContext.groupContext, guid, packet);
        } catch (Exception e) {
            logger.info("--------------群聊消息发送失败------------"+e);
        }
    }


}
