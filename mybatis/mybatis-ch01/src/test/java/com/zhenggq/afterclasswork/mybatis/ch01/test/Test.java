package com.zhenggq.afterclasswork.mybatis.ch01.test;

import java.lang.reflect.Modifier;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/28 16:53
 * @Description:
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(1025&1);
        System.out.println(1025&1033);
        System.out.println(1&0);

        System.out.println((1
                & (Modifier.ABSTRACT | Modifier.PUBLIC | Modifier.STATIC)) == Modifier.PUBLIC);
    }
}
