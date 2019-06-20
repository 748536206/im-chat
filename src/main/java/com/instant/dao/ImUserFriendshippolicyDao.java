package com.instant.dao;

import com.instant.entity.ImUserFriendshippolicy;
import com.instant.entity.ImUserFriendshippolicyQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImUserFriendshippolicyDao {
    /**
     *
     * @mbg.generated 2019-06-20
     */
    long countByQuery(ImUserFriendshippolicyQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int deleteByQuery(ImUserFriendshippolicyQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int deleteByPrimaryKey(Integer uFpId);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int insert(ImUserFriendshippolicy record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int insertSelective(ImUserFriendshippolicy record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    List<ImUserFriendshippolicy> selectByQuery(ImUserFriendshippolicyQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    ImUserFriendshippolicy selectByPrimaryKey(Integer uFpId);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByQuerySelective(@Param("record") ImUserFriendshippolicy record, @Param("example") ImUserFriendshippolicyQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByQuery(@Param("record") ImUserFriendshippolicy record, @Param("example") ImUserFriendshippolicyQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByPrimaryKeySelective(ImUserFriendshippolicy record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByPrimaryKey(ImUserFriendshippolicy record);
}