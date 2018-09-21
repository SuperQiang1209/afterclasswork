package com.zhenggq.afterclasswork.pattern.factory.extend.impl;

import com.zhenggq.afterclasswork.pattern.factory.extend.AbstractFerrariCar;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/21 17:27
 * @Description:
 * @Version: 1.0
 */
public class BlackFerrariCar extends AbstractFerrariCar {
    public String color() {
        return "黑色";
    }
}
