package com.instant.dao;

import com.instant.entity.ImFriendgroups;
import com.instant.entity.ImFriendgroupsQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImFriendgroupsDao {
    /**
     *
     * @mbg.generated 2019-06-20
     */
    long countByQuery(ImFriendgroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int deleteByQuery(ImFriendgroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int deleteByPrimaryKey(Integer fgId);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int insert(ImFriendgroups record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int insertSelective(ImFriendgroups record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    List<ImFriendgroups> selectByQuery(ImFriendgroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    ImFriendgroups selectByPrimaryKey(Integer fgId);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByQuerySelective(@Param("record") ImFriendgroups record, @Param("example") ImFriendgroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByQuery(@Param("record") ImFriendgroups record, @Param("example") ImFriendgroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByPrimaryKeySelective(ImFriendgroups record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByPrimaryKey(ImFriendgroups record);
}