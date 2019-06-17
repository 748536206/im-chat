package com.instant.dao;

import com.instant.entity.ImFriends;
import com.instant.entity.ImFriendsQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImFriendsDao {
    /**
     *
     * @mbg.generated 2019-06-17
     */
    long countByQuery(ImFriendsQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int deleteByQuery(ImFriendsQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int insert(ImFriends record);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int insertSelective(ImFriends record);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    List<ImFriends> selectByQuery(ImFriendsQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int updateByQuerySelective(@Param("record") ImFriends record, @Param("example") ImFriendsQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int updateByQuery(@Param("record") ImFriends record, @Param("example") ImFriendsQuery example);
}