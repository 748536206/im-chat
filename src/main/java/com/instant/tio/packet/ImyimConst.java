package com.instant.tio.packet;

/**
 * 1 好友消息  2 群消息 3 好友握手消息 id位好友 id  4 群握手消息 id位好友 群id
 */
public class ImyimConst {
    /**
     * 聊天消息类型 1对1
     *
     */
     public static final String CHAT_TYPE_FRIEND = "friend";
     /**
      * 聊天消息类型 群聊
      */
     public static final String CHAT_TYPE_GROUP = "group";

     public static final String CHAR_SET = "utf-8";
     public static final byte HAND_SHAKE=3;//握手消息
     public static final byte FRIEND=1;//好友消息
     public static final byte GROUP=2;//群消息
}
