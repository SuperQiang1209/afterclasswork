package com.zhenggq.afterclasswork.mybatis.ch01.dao;

import com.zhenggq.afterclasswork.mybatis.ch01.example.JsonTestExample;
import com.zhenggq.afterclasswork.mybatis.ch01.vo.JsonTest;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JsonTestMapper {
    long countByExample(JsonTestExample example);

    int deleteByExample(JsonTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JsonTest record);

    int insertSelective(JsonTest record);

    List<JsonTest> selectByExample(JsonTestExample example);

    JsonTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JsonTest record, @Param("example") JsonTestExample example);

    int updateByExample(@Param("record") JsonTest record, @Param("example") JsonTestExample example);

    int updateByPrimaryKeySelective(JsonTest record);

    int updateByPrimaryKey(JsonTest record);
}