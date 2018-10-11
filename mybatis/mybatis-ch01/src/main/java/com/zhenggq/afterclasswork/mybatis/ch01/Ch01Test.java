package com.zhenggq.afterclasswork.mybatis.ch01;

import com.zhenggq.afterclasswork.mybatis.ch01.dao.JsonTestMapper;
import com.zhenggq.afterclasswork.mybatis.ch01.vo.JsonTest;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/24 21:43
 * @Description:
 * @Version: 1.0
 */
public class Ch01Test {


    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }


    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = getSqlSession();

            JsonTestMapper mapper = sqlSession.getMapper(JsonTestMapper.class);

            JsonTest r1 = mapper.selectByPrimaryKey(1);
            System.out.println("r1:" + r1 + ",id:" + r1.getId());
            r1.setId(2);

            JsonTest r2 = mapper.selectByPrimaryKey(1);
            JsonTest r3 = mapper.selectByPrimaryKey(1);
            JsonTest r4 = mapper.selectByPrimaryKey(1);

            System.out.println("r2:" + r2 + ",id:" + r2.getId());
            System.out.println("r3:" + r3 + ",id:" + r2.getId());
            System.out.println("r4:" + r4 + ",id:" + r2.getId());


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.commit();
                sqlSession.close();
            }
        }

    }
}
