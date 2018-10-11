package com.zhenggq.afterclasswork.mybatis.ch01.test;

import com.zhenggq.afterclasswork.mybatis.ch01.dao.BlogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/26 15:15
 * @Description:
 * @Version: 1.0
 */
public class BlogMapperTest {
    private static SqlSessionFactory sqlSessionFactory = null;

    @BeforeClass
    public static void loadConfig() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }


    @Test
    public void BlogNAdd1() {
        SqlSession sqlSession = getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        mapper.selectByPrimaryKey(1);
    }

}
