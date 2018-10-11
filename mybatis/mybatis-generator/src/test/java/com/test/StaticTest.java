package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Zhenggq
 * @Date: 2018/9/29 15:24
 * @Description:
 * @Version: 1.0
 */
public class StaticTest {

    public static int i = 0;

    static {

        i = 100;
        System.out.println("StatucTest====1");
    }

    static {
        System.out.println("StatucTest====2");
    }

    {
        System.out.println("StatucTest====4");
    }

    StaticTest() {
        System.out.println(i);
        System.out.println("StatucTest====3");
    }

    public static void main(String[] args) {
       /* new StaticTest();
        new StaticTest();
        new StaticTest();
        new StaticTest();
        new StaticTest();
        new StaticTest();
        new StaticTest();*/

        Map<String, Object> map = new HashMap<String, Object>(13, 0.75f);
        map.put("name", "Zhenggq");


        for (int i = 0; ; ++i) {
            System.out.println(123);
        }


    }
}
