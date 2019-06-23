package com.instant.tio.service;

import org.tio.core.ChannelContext;

public interface ImAnalysisService {
    void convertToClientMsgBody(String text, ChannelContext channelContext);
}
