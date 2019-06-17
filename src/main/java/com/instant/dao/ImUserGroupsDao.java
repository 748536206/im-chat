package com.instant.dao;

import com.instant.entity.ImUserGroups;
import com.instant.entity.ImUserGroupsQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImUserGroupsDao {
    /**
     *
     * @mbg.generated 2019-06-18
     */
    long countByQuery(ImUserGroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int deleteByQuery(ImUserGroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int insert(ImUserGroups record);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int insertSelective(ImUserGroups record);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    List<ImUserGroups> selectByQuery(ImUserGroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int updateByQuerySelective(@Param("record") ImUserGroups record, @Param("example") ImUserGroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int updateByQuery(@Param("record") ImUserGroups record, @Param("example") ImUserGroupsQuery example);
}