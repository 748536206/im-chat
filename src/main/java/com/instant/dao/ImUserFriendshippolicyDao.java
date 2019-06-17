package com.instant.dao;

import com.instant.entity.ImUserFriendshippolicy;
import com.instant.entity.ImUserFriendshippolicyQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImUserFriendshippolicyDao {
    /**
     *
     * @mbg.generated 2019-06-17
     */
    long countByQuery(ImUserFriendshippolicyQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int deleteByQuery(ImUserFriendshippolicyQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int insert(ImUserFriendshippolicy record);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int insertSelective(ImUserFriendshippolicy record);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    List<ImUserFriendshippolicy> selectByQuery(ImUserFriendshippolicyQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int updateByQuerySelective(@Param("record") ImUserFriendshippolicy record, @Param("example") ImUserFriendshippolicyQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int updateByQuery(@Param("record") ImUserFriendshippolicy record, @Param("example") ImUserFriendshippolicyQuery example);
}