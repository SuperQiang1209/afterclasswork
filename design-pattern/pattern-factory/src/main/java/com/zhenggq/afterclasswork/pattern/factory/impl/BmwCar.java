package com.zhenggq.afterclasswork.pattern.factory.impl;

import com.zhenggq.afterclasswork.pattern.factory.ICar;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/21 17:01
 * @Description:
 * @Version: 1.0
 */
public class BmwCar implements ICar {

    public String brand() {
        return "宝马";
    }

    public String color() {
        return "黑色";
    }


}
