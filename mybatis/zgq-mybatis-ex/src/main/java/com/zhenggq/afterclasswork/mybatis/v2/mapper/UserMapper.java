package com.zhenggq.afterclasswork.mybatis.v2.mapper;

import com.zhenggq.afterclasswork.mybatis.v2.annotations.Select;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/28 22:03
 * @Description:
 * @Version: 1.0
 */
public interface UserMapper {
    @Select("select * form user where id = #{id}")
    User selectByPrimaryKey(String s);
}
