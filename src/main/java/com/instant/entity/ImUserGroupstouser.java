package com.instant.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * null
 */
public class ImUserGroupstouser implements Serializable {
    /**
     * 主键
     */
    private Integer ugId;

    /**
     * 外键
     */
    private Integer ugUserid;

    /**
     * 外键
     */
    private Integer ugGroupid;

    /**
     * 发送时间
     */
    private Date ugCreatetime;

    /**
     * 群内用户昵称
     */
    private String ugGroupnick;

    /**
     * im_user_groupstouser
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return ug_id 主键
     */
    public Integer getUgId() {
        return ugId;
    }

    /**
     * 主键
     * @param ugId 主键
     */
    public void setUgId(Integer ugId) {
        this.ugId = ugId;
    }

    /**
     * 外键
     * @return ug _userid 外键
     */
    public Integer getUgUserid() {
        return ugUserid;
    }

    /**
     * 外键
     * @param ugUserid 外键
     */
    public void setUgUserid(Integer ugUserid) {
        this.ugUserid = ugUserid;
    }

    /**
     * 外键
     * @return ug _groupid 外键
     */
    public Integer getUgGroupid() {
        return ugGroupid;
    }

    /**
     * 外键
     * @param ugGroupid 外键
     */
    public void setUgGroupid(Integer ugGroupid) {
        this.ugGroupid = ugGroupid;
    }

    /**
     * 发送时间
     * @return ug _createtime 发送时间
     */
    public Date getUgCreatetime() {
        return ugCreatetime;
    }

    /**
     * 发送时间
     * @param ugCreatetime 发送时间
     */
    public void setUgCreatetime(Date ugCreatetime) {
        this.ugCreatetime = ugCreatetime;
    }

    /**
     * 群内用户昵称
     * @return ug _groupnick 群内用户昵称
     */
    public String getUgGroupnick() {
        return ugGroupnick;
    }

    /**
     * 群内用户昵称
     * @param ugGroupnick 群内用户昵称
     */
    public void setUgGroupnick(String ugGroupnick) {
        this.ugGroupnick = ugGroupnick == null ? null : ugGroupnick.trim();
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
        sb.append(", ugId=").append(ugId);
        sb.append(", ugUserid=").append(ugUserid);
        sb.append(", ugGroupid=").append(ugGroupid);
        sb.append(", ugCreatetime=").append(ugCreatetime);
        sb.append(", ugGroupnick=").append(ugGroupnick);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}