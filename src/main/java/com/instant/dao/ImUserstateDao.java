package com.instant.dao;

import com.instant.entity.ImUserstate;
import com.instant.entity.ImUserstateQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImUserstateDao {
    /**
     *
     * @mbg.generated 2019-06-17
     */
    long countByQuery(ImUserstateQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int deleteByQuery(ImUserstateQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int insert(ImUserstate record);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int insertSelective(ImUserstate record);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    List<ImUserstate> selectByQuery(ImUserstateQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int updateByQuerySelective(@Param("record") ImUserstate record, @Param("example") ImUserstateQuery example);

    /**
     *
     * @mbg.generated 2019-06-17
     */
    int updateByQuery(@Param("record") ImUserstate record, @Param("example") ImUserstateQuery example);
}