package com.instant.dao;

import com.instant.entity.ImMessages;
import com.instant.entity.ImMessagesQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImMessagesDao {
    /**
     *
     * @mbg.generated 2019-06-20
     */
    long countByQuery(ImMessagesQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int deleteByQuery(ImMessagesQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int deleteByPrimaryKey(Integer mId);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int insert(ImMessages record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int insertSelective(ImMessages record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    List<ImMessages> selectByQuery(ImMessagesQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    ImMessages selectByPrimaryKey(Integer mId);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByQuerySelective(@Param("record") ImMessages record, @Param("example") ImMessagesQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByQuery(@Param("record") ImMessages record, @Param("example") ImMessagesQuery example);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByPrimaryKeySelective(ImMessages record);

    /**
     *
     * @mbg.generated 2019-06-20
     */
    int updateByPrimaryKey(ImMessages record);
}