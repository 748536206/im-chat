package com.instant.tio.packet;

import org.tio.utils.time.Time;

public interface MsgType {
    /**
     * 单聊
     * */
    byte CLIENT_TO_CLIENT = 1;
    /**
     * 群聊
     * */
    byte CLIENT_TO_GROUP = 2;
    /**
     * 客户端检查是否在线
     * */
    byte CLIENT_CHECK_ONLINE = 3;
    /**
     * 客户端检查在线人数
     * */
    byte CLIENT_CHECK_ONLINE_COUNT = 4;
    /**
     * 服务端向客户端推送消息
     * */
    byte SERVER_TO_CLIENT_NOTICE = 5;
    /**
     * 添加好友成功之后的消息
     */
    byte SERVER_TO_CLIENT_ADDFRIEND_NOTICE = 6;
    /**
     * 客户端在线状态
     */
    byte CLIENT_ONLINE_STATUS = 7;

    /**
     * 协议名字(可以随便取，主要用于开发人员辨识)
     */
    public static final String PROTOCOL_NAME = "showcase";
    public static final String CHARSET = "utf-8";
    /**
     * 监听的ip
     */
    public static final String SERVER_IP = null;//null表示监听所有，并不指定ip
    /**
     * 监听端口
     */
    public static final int SERVER_PORT = 9326;
    /**
     * 心跳超时时间，单位：毫秒
     */
    public static final int HEARTBEAT_TIMEOUT = 1000 * 60;
    /**
     * ip数据监控统计，时间段
     * @author tanyaowu
     *
     */
    public static interface IpStatDuration {
        public static final Long DURATION_1 = Time.MINUTE_1 * 5;
        public static final Long[] IPSTAT_DURATIONS = new Long[] { DURATION_1 };
    }



}
