package com.zhenggq.afterclasswork.mybatis.ch01;

import org.apache.ibatis.io.Resources;
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


    public static void main(String[] args) {
        try {
            String resource = "org/mybatis/example/mybatis-config.xml";
            InputStream inputStream = inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
            sql sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
