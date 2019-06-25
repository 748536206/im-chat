package com.instant.tio.service;

import com.instant.tio.packet.ImReceiveBody;
import org.tio.core.ChannelContext;

public interface ImAnalysisService {
    void convertToClientMsgBody(String text, ChannelContext channelContext, ImReceiveBody imReceiveBody);
}
