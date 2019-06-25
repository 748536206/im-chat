package com.instant.tio.service;

import org.tio.core.ChannelContext;
import org.tio.core.intf.Packet;

public interface ImSendService {
    //发送单聊消息
    void sendToUser(ChannelContext channelContext, String userid, Packet packet);
    void sendToGroup(ChannelContext channelContext, String guid, Packet packet);
}
