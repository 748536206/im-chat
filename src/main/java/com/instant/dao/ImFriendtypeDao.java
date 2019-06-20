package com.instant.dao;

import com.instant.entity.ImFriendtype;
import com.instant.entity.ImFriendtypeQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImFriendtypeDao {
    /**
     *
     * @mbg.generated 2019-06-20
     */
    long countByQuery(ImFriendtypeQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int deleteByQuery(ImFriendtypeQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int deleteByPrimaryKey(Integer ftId);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int insert(ImFriendtype record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int insertSelective(ImFriendtype record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    List<ImFriendtype> selectByQuery(ImFriendtypeQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    ImFriendtype selectByPrimaryKey(Integer ftId);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByQuerySelective(@Param("record") ImFriendtype record, @Param("example") ImFriendtypeQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByQuery(@Param("record") ImFriendtype record, @Param("example") ImFriendtypeQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByPrimaryKeySelective(ImFriendtype record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByPrimaryKey(ImFriendtype record);
}