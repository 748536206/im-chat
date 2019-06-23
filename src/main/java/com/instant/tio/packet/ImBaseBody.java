package com.instant.tio.packet;

import java.io.Serializable;

public class ImBaseBody extends ImyimMsgProperty implements Serializable{
    private static final Long serialVersionUID = 1L;
    public long getTimestamp() {
        if (timestamp == 0){
            timestamp = System.currentTimeMillis();
        }
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    private long timestamp;
}
