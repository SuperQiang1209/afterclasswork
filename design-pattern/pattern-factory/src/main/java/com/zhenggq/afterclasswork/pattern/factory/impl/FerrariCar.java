package com.zhenggq.afterclasswork.pattern.factory.impl;

import com.zhenggq.afterclasswork.pattern.factory.ICar;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/21 17:02
 * @Description:
 * @Version: 1.0
 */
public class FerrariCar implements ICar {

    public String brand() {
        return "法拉利";
    }

    public String color() {
        return "红色";
    }

}
