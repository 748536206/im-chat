package com.instant.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * null
 */
public class ImMessages implements Serializable {
    /**
     * (消息id)    主键，自增
     */
    private Integer mId;

    /**
     * 消息内容
     */
    private String mPostmessages;

    /**
     * 接收状态
     */
    private String mStatus;

    /**
     * 发送时间
     */
    private Date mTime;

    /**
     * 消息类型id
     */
    private Integer mMessagestypeid;

    /**
     * 发送者id
     */
    private Integer mFromuserid;

    /**
     * 接收者id
     */
    private Integer mTouserid;

    /**
     * im_messages
     */
    private static final long serialVersionUID = 1L;

    /**
     * (消息id)    主键，自增
     * @return m_id (消息id)    主键，自增
     */
    public Integer getmId() {
        return mId;
    }

    /**
     * (消息id)    主键，自增
     * @param mId (消息id)    主键，自增
     */
    public void setmId(Integer mId) {
        this.mId = mId;
    }

    /**
     * 消息内容
     * @return m_postmessages 消息内容
     */
    public String getmPostmessages() {
        return mPostmessages;
    }

    /**
     * 消息内容
     * @param mPostmessages 消息内容
     */
    public void setmPostmessages(String mPostmessages) {
        this.mPostmessages = mPostmessages == null ? null : mPostmessages.trim();
    }

    /**
     * 接收状态
     * @return m_status 接收状态
     */
    public String getmStatus() {
        return mStatus;
    }

    /**
     * 接收状态
     * @param mStatus 接收状态
     */
    public void setmStatus(String mStatus) {
        this.mStatus = mStatus == null ? null : mStatus.trim();
    }

    /**
     * 发送时间
     * @return m_time 发送时间
     */
    public Date getmTime() {
        return mTime;
    }

    /**
     * 发送时间
     * @param mTime 发送时间
     */
    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }

    /**
     * 消息类型id
     * @return m_messagestypeid 消息类型id
     */
    public Integer getmMessagestypeid() {
        return mMessagestypeid;
    }

    /**
     * 消息类型id
     * @param mMessagestypeid 消息类型id
     */
    public void setmMessagestypeid(Integer mMessagestypeid) {
        this.mMessagestypeid = mMessagestypeid;
    }

    /**
     * 发送者id
     * @return m_ fromuserid 发送者id
     */
    public Integer getmFromuserid() {
        return mFromuserid;
    }

    /**
     * 发送者id
     * @param mFromuserid 发送者id
     */
    public void setmFromuserid(Integer mFromuserid) {
        this.mFromuserid = mFromuserid;
    }

    /**
     * 接收者id
     * @return m_touserid 接收者id
     */
    public Integer getmTouserid() {
        return mTouserid;
    }

    /**
     * 接收者id
     * @param mTouserid 接收者id
     */
    public void setmTouserid(Integer mTouserid) {
        this.mTouserid = mTouserid;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mId=").append(mId);
        sb.append(", mPostmessages=").append(mPostmessages);
        sb.append(", mStatus=").append(mStatus);
        sb.append(", mTime=").append(mTime);
        sb.append(", mMessagestypeid=").append(mMessagestypeid);
        sb.append(", mFromuserid=").append(mFromuserid);
        sb.append(", mTouserid=").append(mTouserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}