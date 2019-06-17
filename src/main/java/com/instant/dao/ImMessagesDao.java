package com.instant.dao;

import com.instant.entity.ImMessages;
import com.instant.entity.ImMessagesQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImMessagesDao {
    /**
     *
     * @mbg.generated 2019-06-17
     */
    long countByQuery(ImMessagesQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int deleteByQuery(ImMessagesQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int insert(ImMessages record);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int insertSelective(ImMessages record);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    List<ImMessages> selectByQuery(ImMessagesQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int updateByQuerySelective(@Param("record") ImMessages record, @Param("example") ImMessagesQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int updateByQuery(@Param("record") ImMessages record, @Param("example") ImMessagesQuery example);
}