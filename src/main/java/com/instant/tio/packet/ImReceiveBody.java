package com.instant.tio.packet;


import java.io.Serializable;

public class ImReceiveBody implements Serializable {
    //{"mtype":1,"content":"在么","toid":2}
    private int mtype;
    private int toid;
    private String content;

    public int getMtype() {
        return mtype;
    }

    public void setMtype(int mtype) {
        this.mtype = mtype;
    }

    public int getToid() {
        return toid;
    }

    public void setToid(int toid) {
        this.toid = toid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ImReceiveBody{" +
                "mtype=" + mtype +
                ", toid=" + toid +
                ", content='" + content + '\'' +
                '}';
    }
}
