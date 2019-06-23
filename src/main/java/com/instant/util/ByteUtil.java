package com.instant.util;

import com.instant.tio.packet.ImyimConst;
import org.tio.utils.json.Json;

import java.io.IOException;

public class ByteUtil {
    /**
     * 转换成byte[]
     * */
    public static byte[] toBytes(Object obj) throws IOException{
        if(obj == null) {
            return null;
        }
        if(obj instanceof String){
            return ((String) obj).getBytes(ImyimConst.CHAR_SET);
        }
        return Json.toJson(obj).getBytes(ImyimConst.CHAR_SET);
    }

    /**
     * byte[] 转换成string
     * */
    public static String toText(byte[] bytes) throws IOException{
        if(bytes == null|| bytes.length == 0){
            return null;
        }
        return new String(bytes, ImyimConst.CHAR_SET);
    }
}
