package com.instant.dao;

import com.instant.entity.ImUserGroupstouser;
import com.instant.entity.ImUserGroupstouserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImUserGroupstouserDao {
    /**
     *
     * @mbg.generated 2019-06-20
     */
    long countByQuery(ImUserGroupstouserQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int deleteByQuery(ImUserGroupstouserQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int deleteByPrimaryKey(Integer ugId);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int insert(ImUserGroupstouser record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int insertSelective(ImUserGroupstouser record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    List<ImUserGroupstouser> selectByQuery(ImUserGroupstouserQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    ImUserGroupstouser selectByPrimaryKey(Integer ugId);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByQuerySelective(@Param("record") ImUserGroupstouser record, @Param("example") ImUserGroupstouserQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByQuery(@Param("record") ImUserGroupstouser record, @Param("example") ImUserGroupstouserQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByPrimaryKeySelective(ImUserGroupstouser record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByPrimaryKey(ImUserGroupstouser record);
}