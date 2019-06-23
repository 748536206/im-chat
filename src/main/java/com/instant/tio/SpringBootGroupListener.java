package com.instant.tio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.core.intf.GroupListener;

public class SpringBootGroupListener implements GroupListener {
    private static Logger logger = LoggerFactory.getLogger(SpringBootGroupListener.class);

    @Override
    public void onAfterBind(ChannelContext channelContext, String s) throws Exception {
        logger.info("---------------------------onAfterBind---------------------------");

    }

    @Override
    public void onAfterUnbind(ChannelContext channelContext, String s) throws Exception {
        logger.info("---------------------------onAfterUnbind---------------------------");

    }
}
