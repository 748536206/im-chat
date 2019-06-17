package com.instant.entity;

import java.io.Serializable;

/**
 * null
 */
public class UserInfo implements Serializable {
    /**
     *
     */
    private Integer uid;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private String salt;

    /**
     *
     */
    private String state;

    /**
     *
     */
    private String username;

    /**
     *
     */
    private String status;

    /**
     *
     */
    private String sign;

    /**
     *
     */
    private String avatar;

    /**
     * user_info
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     *
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     *
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     *
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     *
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     *
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     *
     * @return sign
     */
    public String getSign() {
        return sign;
    }

    /**
     *
     * @param sign
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     *
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     *
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", state=").append(state);
        sb.append(", username=").append(username);
        sb.append(", status=").append(status);
        sb.append(", sign=").append(sign);
        sb.append(", avatar=").append(avatar);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}