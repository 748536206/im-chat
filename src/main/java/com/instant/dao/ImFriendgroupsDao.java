package com.instant.dao;

import com.instant.entity.ImFriendgroups;
import com.instant.entity.ImFriendgroupsQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImFriendgroupsDao {
    /**
     *
     * @mbg.generated 2019-06-17
     */
    long countByQuery(ImFriendgroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int deleteByQuery(ImFriendgroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int insert(ImFriendgroups record);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int insertSelective(ImFriendgroups record);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    List<ImFriendgroups> selectByQuery(ImFriendgroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int updateByQuerySelective(@Param("record") ImFriendgroups record, @Param("example") ImFriendgroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int updateByQuery(@Param("record") ImFriendgroups record, @Param("example") ImFriendgroupsQuery example);
}