package com.instant.dao;

import com.instant.entity.ImFriendtype;
import com.instant.entity.ImFriendtypeQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImFriendtypeDao {
    /**
     *
     * @mbg.generated 2019-06-17
     */
    long countByQuery(ImFriendtypeQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int deleteByQuery(ImFriendtypeQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int insert(ImFriendtype record);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int insertSelective(ImFriendtype record);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    List<ImFriendtype> selectByQuery(ImFriendtypeQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int updateByQuerySelective(@Param("record") ImFriendtype record, @Param("example") ImFriendtypeQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int updateByQuery(@Param("record") ImFriendtype record, @Param("example") ImFriendtypeQuery example);
}