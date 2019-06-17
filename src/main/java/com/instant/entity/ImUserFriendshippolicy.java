package com.instant.entity;

import java.io.Serializable;

/**
 * null
 */
public class ImUserFriendshippolicy implements Serializable {
    /**
     * 策略id    主键
     */
    private Integer uFpId;

    /**
     * 好友添加方式 
     */
    private String uFriendshippolicy;

    /**
     * im_user_friendshippolicy
     */
    private static final long serialVersionUID = 1L;

    /**
     * 策略id    主键
     * @return u_fp_id 策略id    主键
     */
    public Integer getuFpId() {
        return uFpId;
    }

    /**
     * 策略id    主键
     * @param uFpId 策略id    主键
     */
    public void setuFpId(Integer uFpId) {
        this.uFpId = uFpId;
    }

    /**
     * 好友添加方式 
     * @return u_friendshippolicy 好友添加方式 
     */
    public String getuFriendshippolicy() {
        return uFriendshippolicy;
    }

    /**
     * 好友添加方式 
     * @param uFriendshippolicy 好友添加方式 
     */
    public void setuFriendshippolicy(String uFriendshippolicy) {
        this.uFriendshippolicy = uFriendshippolicy == null ? null : uFriendshippolicy.trim();
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
        sb.append(", uFpId=").append(uFpId);
        sb.append(", uFriendshippolicy=").append(uFriendshippolicy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}