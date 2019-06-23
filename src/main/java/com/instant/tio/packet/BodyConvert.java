package com.instant.tio.packet;

import com.instant.util.ByteUtil;
import org.tio.utils.json.Json;
import org.tio.websocket.common.Opcode;
import org.tio.websocket.common.WsResponse;

import java.io.IOException;

public class BodyConvert {
    private static BodyConvert instance;
    private static byte obj[] = new byte[0];

    public static BodyConvert getInstance() {
        if (instance == null) {
            synchronized (obj) {
                if (instance == null) {
                    instance = new BodyConvert();
                }
            }
        }
        return instance;
    }

    public WsResponse convertToTextResponse(Object body) throws IOException {
        WsResponse response = new WsResponse();
        if (body != null) {
            String json = Json.toJson(body);
            response.setBody(ByteUtil.toBytes(json));
            response.setWsBodyText(json);
            response.setWsBodyLength(response.getWsBodyText().length());
            //返回text类型消息（如果这里设置成 BINARY,那么客户端就需要进行解析了）
            response.setWsOpcode(Opcode.TEXT);
        }
        return response;
    }
}
