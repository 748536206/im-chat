package com.instant.entity;

import java.io.Serializable;

/**
 * null
 */
public class ImFriendgroups implements Serializable {
    /**
     * 分组id   主键
     */
    private Integer fgId;

    /**
     * 分组名字
     */
    private String fgName;

    /**
     * 用户id    外键
     */
    private Integer fgUserid;

    /**
     * im_friendgroups
     */
    private static final long serialVersionUID = 1L;

    /**
     * 分组id   主键
     * @return fg_id 分组id   主键
     */
    public Integer getFgId() {
        return fgId;
    }

    /**
     * 分组id   主键
     * @param fgId 分组id   主键
     */
    public void setFgId(Integer fgId) {
        this.fgId = fgId;
    }

    /**
     * 分组名字
     * @return fg_name 分组名字
     */
    public String getFgName() {
        return fgName;
    }

    /**
     * 分组名字
     * @param fgName 分组名字
     */
    public void setFgName(String fgName) {
        this.fgName = fgName == null ? null : fgName.trim();
    }

    /**
     * 用户id    外键
     * @return fg_userid 用户id    外键
     */
    public Integer getFgUserid() {
        return fgUserid;
    }

    /**
     * 用户id    外键
     * @param fgUserid 用户id    外键
     */
    public void setFgUserid(Integer fgUserid) {
        this.fgUserid = fgUserid;
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
        sb.append(", fgId=").append(fgId);
        sb.append(", fgName=").append(fgName);
        sb.append(", fgUserid=").append(fgUserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}