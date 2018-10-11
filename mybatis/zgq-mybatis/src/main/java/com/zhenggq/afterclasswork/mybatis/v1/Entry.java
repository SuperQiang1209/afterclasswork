package com.zhenggq.afterclasswork.mybatis.v1;

import com.zhenggq.afterclasswork.mybatis.v1.Test.UserMapper;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/28 23:58
 * @Description:
 * @Version: 1.0z
 */
public class Entry {
    public static void main(String[] args) {

        ZGQSqlSession sqlSession = new ZGQDefaultSqlSession(new ZGQConfiguration(), new ZGQSimpleExecutor());
        UserMapper mapper = sqlSession.getMapper(UserMapper.class, sqlSession);
        System.out.println(mapper.selectByPrimaryKey("1"));

    }
}
