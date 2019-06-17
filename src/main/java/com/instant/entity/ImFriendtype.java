package com.instant.entity;

import java.io.Serializable;

/**
 * null
 */
public class ImFriendtype implements Serializable {
    /**
     * （类型id）    主键
     */
    private Integer ftId;

    /**
     * 类型名称
     */
    private String ftName;

    /**
     * im_friendtype
     */
    private static final long serialVersionUID = 1L;

    /**
     * （类型id）    主键
     * @return ft_id （类型id）    主键
     */
    public Integer getFtId() {
        return ftId;
    }

    /**
     * （类型id）    主键
     * @param ftId （类型id）    主键
     */
    public void setFtId(Integer ftId) {
        this.ftId = ftId;
    }

    /**
     * 类型名称
     * @return ft_name 类型名称
     */
    public String getFtName() {
        return ftName;
    }

    /**
     * 类型名称
     * @param ftName 类型名称
     */
    public void setFtName(String ftName) {
        this.ftName = ftName == null ? null : ftName.trim();
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
        sb.append(", ftId=").append(ftId);
        sb.append(", ftName=").append(ftName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}