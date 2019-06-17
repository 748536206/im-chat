package com.instant.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * null
 */
public class ImUserGroups implements Serializable {
    /**
     *  群id    主键
     */
    private Integer ugId;

    /**
     * 群名称 
     */
    private String ugName;

    /**
     * 创建时间    默认值
     */
    private Date ugCreatetime;

    /**
     * 群主id（指向用户表）
     */
    private Integer ugAdminid;

    /**
     * 群图标
     */
    private String ugIcon;

    /**
     * 群公告 
     */
    private String ugNotice;

    /**
     * 群简介 
     */
    private String ugIntro;

    /**
     * im_user_groups
     */
    private static final long serialVersionUID = 1L;

    /**
     *  群id    主键
     * @return ug_id  群id    主键
     */
    public Integer getUgId() {
        return ugId;
    }

    /**
     *  群id    主键
     * @param ugId  群id    主键
     */
    public void setUgId(Integer ugId) {
        this.ugId = ugId;
    }

    /**
     * 群名称 
     * @return ug_name 群名称 
     */
    public String getUgName() {
        return ugName;
    }

    /**
     * 群名称 
     * @param ugName 群名称 
     */
    public void setUgName(String ugName) {
        this.ugName = ugName == null ? null : ugName.trim();
    }

    /**
     * 创建时间    默认值
     * @return ug_createtime 创建时间    默认值
     */
    public Date getUgCreatetime() {
        return ugCreatetime;
    }

    /**
     * 创建时间    默认值
     * @param ugCreatetime 创建时间    默认值
     */
    public void setUgCreatetime(Date ugCreatetime) {
        this.ugCreatetime = ugCreatetime;
    }

    /**
     * 群主id（指向用户表）
     * @return ug_adminid 群主id（指向用户表）
     */
    public Integer getUgAdminid() {
        return ugAdminid;
    }

    /**
     * 群主id（指向用户表）
     * @param ugAdminid 群主id（指向用户表）
     */
    public void setUgAdminid(Integer ugAdminid) {
        this.ugAdminid = ugAdminid;
    }

    /**
     * 群图标
     * @return ug_icon 群图标
     */
    public String getUgIcon() {
        return ugIcon;
    }

    /**
     * 群图标
     * @param ugIcon 群图标
     */
    public void setUgIcon(String ugIcon) {
        this.ugIcon = ugIcon == null ? null : ugIcon.trim();
    }

    /**
     * 群公告 
     * @return ug_notice 群公告 
     */
    public String getUgNotice() {
        return ugNotice;
    }

    /**
     * 群公告 
     * @param ugNotice 群公告 
     */
    public void setUgNotice(String ugNotice) {
        this.ugNotice = ugNotice == null ? null : ugNotice.trim();
    }

    /**
     * 群简介 
     * @return ug_intro 群简介 
     */
    public String getUgIntro() {
        return ugIntro;
    }

    /**
     * 群简介 
     * @param ugIntro 群简介 
     */
    public void setUgIntro(String ugIntro) {
        this.ugIntro = ugIntro == null ? null : ugIntro.trim();
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
        sb.append(", ugName=").append(ugName);
        sb.append(", ugCreatetime=").append(ugCreatetime);
        sb.append(", ugAdminid=").append(ugAdminid);
        sb.append(", ugIcon=").append(ugIcon);
        sb.append(", ugNotice=").append(ugNotice);
        sb.append(", ugIntro=").append(ugIntro);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}