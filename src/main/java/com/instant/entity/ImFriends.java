package com.instant.entity;

import java.io.Serializable;

/**
 * null
 */
public class ImFriends implements Serializable {
    /**
     * 主键id    主键
     */
    private Integer fId;

    /**
     * 朋友的id    外键
     */
    private Integer fFirendid;

    /**
     * 自己的id    外键
     */
    private Integer fUserid;

    /**
     * 备注昵称
     */
    private String fName;

    /**
     * 好友类型
     */
    private Integer fFriendtypeid;

    /**
     * 所属分组id   外键
     */
    private Integer fFriendgroupsid;

    /**
     * im_friends
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键id    主键
     * @return f_id 主键id    主键
     */
    public Integer getfId() {
        return fId;
    }

    /**
     * 主键id    主键
     * @param fId 主键id    主键
     */
    public void setfId(Integer fId) {
        this.fId = fId;
    }

    /**
     * 朋友的id    外键
     * @return f_firendid 朋友的id    外键
     */
    public Integer getfFirendid() {
        return fFirendid;
    }

    /**
     * 朋友的id    外键
     * @param fFirendid 朋友的id    外键
     */
    public void setfFirendid(Integer fFirendid) {
        this.fFirendid = fFirendid;
    }

    /**
     * 自己的id    外键
     * @return f_userid 自己的id    外键
     */
    public Integer getfUserid() {
        return fUserid;
    }

    /**
     * 自己的id    外键
     * @param fUserid 自己的id    外键
     */
    public void setfUserid(Integer fUserid) {
        this.fUserid = fUserid;
    }

    /**
     * 备注昵称
     * @return f_name 备注昵称
     */
    public String getfName() {
        return fName;
    }

    /**
     * 备注昵称
     * @param fName 备注昵称
     */
    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    /**
     * 好友类型
     * @return f_friendtypeid 好友类型
     */
    public Integer getfFriendtypeid() {
        return fFriendtypeid;
    }

    /**
     * 好友类型
     * @param fFriendtypeid 好友类型
     */
    public void setfFriendtypeid(Integer fFriendtypeid) {
        this.fFriendtypeid = fFriendtypeid;
    }

    /**
     * 所属分组id   外键
     * @return f_friendgroupsid 所属分组id   外键
     */
    public Integer getfFriendgroupsid() {
        return fFriendgroupsid;
    }

    /**
     * 所属分组id   外键
     * @param fFriendgroupsid 所属分组id   外键
     */
    public void setfFriendgroupsid(Integer fFriendgroupsid) {
        this.fFriendgroupsid = fFriendgroupsid;
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
        sb.append(", fId=").append(fId);
        sb.append(", fFirendid=").append(fFirendid);
        sb.append(", fUserid=").append(fUserid);
        sb.append(", fName=").append(fName);
        sb.append(", fFriendtypeid=").append(fFriendtypeid);
        sb.append(", fFriendgroupsid=").append(fFriendgroupsid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}