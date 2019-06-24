package com.instant.entity.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;


public class UserViewModel implements Serializable {
    private String username;
    private String avatar;
    private String status;
    private String sign;
    private int    id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserViewModel{" +
                "username='" + username + '\'' +
                ", avatar='" + avatar + '\'' +
                ", status='" + status + '\'' +
                ", sign='" + sign + '\'' +
                ", id=" + id +
                '}';
    }
}
