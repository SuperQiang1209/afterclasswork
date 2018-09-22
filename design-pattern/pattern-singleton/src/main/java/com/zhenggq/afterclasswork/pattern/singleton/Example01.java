package com.zhenggq.afterclasswork.pattern.singleton;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/21 22:37
 * @Description:
 * @Version: 1.0
 */
public class Example01 {

    private Example01() {
    }

    private static Example01 t = null;

    public static synchronized Example01 getInstance() {
        if (t == null) {
            t = new Example01();
        }
        return t;
    }
}
