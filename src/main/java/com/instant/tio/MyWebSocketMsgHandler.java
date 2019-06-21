package com.instant.tio;

import com.instant.tio.inter.MsgType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.core.Tio;
import org.tio.http.common.HttpRequest;
import org.tio.http.common.HttpResponse;
import org.tio.websocket.common.WsRequest;
import org.tio.websocket.server.handler.IWsMsgHandler;

public class MyWebSocketMsgHandler implements IWsMsgHandler {
    private static Logger logger = LoggerFactory.getLogger(MyWebSocketMsgHandler.class);


    @Override
    public HttpResponse handshake(HttpRequest httpRequest, HttpResponse httpResponse, ChannelContext channelContext) throws Exception {

        //Tio.bindUser();
        logger.info("----------------------------------");


        return httpResponse;
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
        return null;
    }

    /**
     * 接收到文本消息
     */
    @Override
    public Object onText(WsRequest wsRequest, String masg, ChannelContext channelContext) throws Exception {
        logger.info("---------------------------接收到文本消息---------------------------{}"+masg);
        return null;
    }
}
