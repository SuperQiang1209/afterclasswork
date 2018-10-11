package com.zhenggq.afterclasswork.mybatis.ch01.dao;

import com.zhenggq.afterclasswork.mybatis.ch01.vo.Posts;
import com.zhenggq.afterclasswork.mybatis.ch01.vo.PostsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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