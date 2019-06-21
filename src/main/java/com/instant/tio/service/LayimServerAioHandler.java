//package com.instant.tio.service;
//
//import com.instant.util.Protocol;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.tio.core.ChannelContext;
//import org.tio.core.GroupContext;
//import org.tio.core.exception.AioDecodeException;
//import org.tio.core.intf.Packet;
//import org.tio.http.common.HttpRequest;
//import org.tio.http.common.HttpRequestDecoder;
//import org.tio.http.common.HttpResponse;
//import org.tio.server.intf.ServerAioHandler;
//import org.tio.websocket.common.WsRequest;
//import org.tio.websocket.common.WsServerDecoder;
//import org.tio.websocket.common.WsSessionContext;
//
//import java.nio.ByteBuffer;
//
//public class LayimServerAioHandler implements ServerAioHandler {
//    private static Logger log = LoggerFactory.getLogger(LayimServerAioHandler.class);
//
//    @Override
//    public Packet decode(ByteBuffer byteBuffer, int i, int i1, int i2, ChannelContext channelContext) throws AioDecodeException {
//        WsSessionContext wsSessionContext = (WsSessionContext) channelContext.getAttribute();
//        log.info("LayimServerAioHandler.decode");
//        if (!wsSessionContext.isHandshaked()) {
//            HttpRequest request = HttpRequestDecoder.decode(buffer, channelContext);
//            if (request == null) {
//                return null;
//            }
//
//            HttpResponse httpResponse = Protocol.updateToWebSocket(request, channelContext);
//            if (httpResponse == null) {
//                throw new AioDecodeException("http协议升级到websocket协议失败");
//            }
//
//            wsSessionContext.setHandshakeRequest(request);
//            wsSessionContext.setHandshakeResponse(httpResponse);
//
//            WsRequest wsRequestPacket = new WsRequest();
//            wsRequestPacket.setHandShake(true);
//            log.info("握手成功");
//            return wsRequestPacket;
//        }
//        return WsServerDecoder.decode(buffer, channelContext);
//    }
//
//    @Override
//    public ByteBuffer encode(Packet packet, GroupContext groupContext, ChannelContext channelContext) {
//        return null;
//    }
//
//    @Override
//    public void handler(Packet packet, ChannelContext channelContext) throws Exception {
//
//    }
//}
