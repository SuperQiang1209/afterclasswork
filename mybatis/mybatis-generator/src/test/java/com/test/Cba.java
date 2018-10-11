package com.test;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/24 21:10
 * @Description:
 * @Version: 1.0
 */
public class Cba {

    private String name;

    public Cba(String name) {
        this.name = name;
    }

    public void Test() {
        System.out.println(System.currentTimeMillis() + ":Cba.Out:" + this);
    }
}
