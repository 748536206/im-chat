package com.instant.dao;

import com.instant.entity.UserInfo;
import com.instant.entity.UserInfoQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    /**
     *
     * @mbg.generated 2019-06-20
     */
    long countByQuery(UserInfoQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int deleteByQuery(UserInfoQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int insert(UserInfo record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int insertSelective(UserInfo record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    List<UserInfo> selectByQuery(UserInfoQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    UserInfo selectByPrimaryKey(Integer uid);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByQuerySelective(@Param("record") UserInfo record, @Param("example") UserInfoQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByQuery(@Param("record") UserInfo record, @Param("example") UserInfoQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByPrimaryKey(UserInfo record);
}