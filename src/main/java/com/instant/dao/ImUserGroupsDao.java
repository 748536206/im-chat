package com.instant.dao;

import com.instant.entity.ImUserGroups;
import com.instant.entity.ImUserGroupsQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImUserGroupsDao {
    /**
     *
     * @mbg.generated 2019-06-20
     */
    long countByQuery(ImUserGroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int deleteByQuery(ImUserGroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int deleteByPrimaryKey(Integer ugId);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int insert(ImUserGroups record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int insertSelective(ImUserGroups record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    List<ImUserGroups> selectByQuery(ImUserGroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    ImUserGroups selectByPrimaryKey(Integer ugId);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByQuerySelective(@Param("record") ImUserGroups record, @Param("example") ImUserGroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByQuery(@Param("record") ImUserGroups record, @Param("example") ImUserGroupsQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByPrimaryKeySelective(ImUserGroups record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByPrimaryKey(ImUserGroups record);
}