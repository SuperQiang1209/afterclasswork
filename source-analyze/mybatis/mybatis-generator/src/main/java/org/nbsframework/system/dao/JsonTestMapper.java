package org.nbsframework.system.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.nbsframework.system.vo.JsonTest;
import org.nbsframework.system.vo.JsonTestExample;

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