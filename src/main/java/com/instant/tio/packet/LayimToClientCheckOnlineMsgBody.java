package com.instant.tio.packet;


import com.instant.tio.inter.MsgType;

public class LayimToClientCheckOnlineMsgBody extends LayimBaseBody {

    public LayimToClientCheckOnlineMsgBody(boolean online){
        this.online = online;
    }


    public boolean isOnline() {
        return online;
    }

    private boolean online;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    @Override
    public byte getMtype() {
        return MsgType.CLIENT_CHECK_ONLINE;
    }
}
