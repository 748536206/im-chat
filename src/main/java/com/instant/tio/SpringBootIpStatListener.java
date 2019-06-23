package com.instant.tio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.core.GroupContext;
import org.tio.core.intf.Packet;
import org.tio.core.stat.IpStat;
import org.tio.core.stat.IpStatListener;

public class SpringBootIpStatListener implements IpStatListener {
    private static Logger logger = LoggerFactory.getLogger(SpringBootIpStatListener.class);

    @Override
    public void onExpired(GroupContext groupContext, IpStat ipStat) {
        logger.info("---------------------------onExpired---------------------------");

    }

    @Override
    public void onAfterConnected(ChannelContext channelContext, boolean b, boolean b1, IpStat ipStat) throws Exception {
        logger.info("---------------------------onAfterConnected---------------------------");

    }

    @Override
    public void onDecodeError(ChannelContext channelContext, IpStat ipStat) {
        logger.info("---------------------------onDecodeError---------------------------");

    }

    @Override
    public void onAfterSent(ChannelContext channelContext, Packet packet, boolean b, IpStat ipStat) throws Exception {
        logger.info("---------------------------onAfterSent---------------------------");

    }

    @Override
    public void onAfterDecoded(ChannelContext channelContext, Packet packet, int i, IpStat ipStat) throws Exception {
        logger.info("---------------------------onAfterDecoded---------------------------");

    }

    @Override
    public void onAfterReceivedBytes(ChannelContext channelContext, int i, IpStat ipStat) throws Exception {
        logger.info("---------------------------onAfterReceivedBytes---------------------------");

    }

    @Override
    public void onAfterHandled(ChannelContext channelContext, Packet packet, IpStat ipStat, long l) throws Exception {
        logger.info("---------------------------onAfterHandled---------------------------");

    }
}
