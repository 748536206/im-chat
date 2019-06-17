package com.instant.dao;

import com.instant.entity.ImUserGroupstouser;
import com.instant.entity.ImUserGroupstouserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImUserGroupstouserDao {
    /**
     *
     * @mbg.generated 2019-06-18
     */
    long countByQuery(ImUserGroupstouserQuery example);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int deleteByQuery(ImUserGroupstouserQuery example);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int insert(ImUserGroupstouser record);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int insertSelective(ImUserGroupstouser record);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    List<ImUserGroupstouser> selectByQuery(ImUserGroupstouserQuery example);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int updateByQuerySelective(@Param("record") ImUserGroupstouser record, @Param("example") ImUserGroupstouserQuery example);

    /**
     *
     * @mbg.generated 2019-06-18
     */
    int updateByQuery(@Param("record") ImUserGroupstouser record, @Param("example") ImUserGroupstouserQuery example);
}