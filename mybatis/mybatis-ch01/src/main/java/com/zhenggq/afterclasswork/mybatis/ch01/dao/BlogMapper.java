package com.zhenggq.afterclasswork.mybatis.ch01.dao;

import com.zhenggq.afterclasswork.mybatis.ch01.example.BlogExample;
import com.zhenggq.afterclasswork.mybatis.ch01.vo.Blog;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.util.List;

public interface BlogMapper {

    long countByExample(BlogExample example);

    int deleteByExample(BlogExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Blog record);

    int insertSelective(Blog record);

    List<Blog> selectByExample(BlogExample example);

    Blog selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);
}