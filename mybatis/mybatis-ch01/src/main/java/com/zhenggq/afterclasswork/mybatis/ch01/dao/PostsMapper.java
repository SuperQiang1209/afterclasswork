package com.zhenggq.afterclasswork.mybatis.ch01.dao;

import com.zhenggq.afterclasswork.mybatis.ch01.example.PostsExample;
import com.zhenggq.afterclasswork.mybatis.ch01.vo.Posts;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostsMapper {
    long countByExample(PostsExample example);

    int deleteByExample(PostsExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Posts record);

    int insertSelective(Posts record);

    List<Posts> selectByExample(PostsExample example);

    Posts selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Posts record, @Param("example") PostsExample example);

    int updateByExample(@Param("record") Posts record, @Param("example") PostsExample example);

    int updateByPrimaryKeySelective(Posts record);

    int updateByPrimaryKey(Posts record);
}