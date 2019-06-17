package com.instant.entity;

import java.io.Serializable;

/**
 * null
 */
public class ImUserstate implements Serializable {
    /**
     * 状态
     */
    private Integer usId;

    /**
     * 状态名称 在线  离线 忙碌  
     */
    private String usName;

    /**
     * im_userstate
     */
    private static final long serialVersionUID = 1L;

    /**
     * 状态
     * @return us_id 状态
     */
    public Integer getUsId() {
        return usId;
    }

    /**
     * 状态
     * @param usId 状态
     */
    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    /**
     * 状态名称 在线  离线 忙碌  
     * @return us_name 状态名称 在线  离线 忙碌  
     */
    public String getUsName() {
        return usName;
    }

    /**
     * 状态名称 在线  离线 忙碌  
     * @param usName 状态名称 在线  离线 忙碌  
     */
    public void setUsName(String usName) {
        this.usName = usName == null ? null : usName.trim();
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
        sb.append(", usId=").append(usId);
        sb.append(", usName=").append(usName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}