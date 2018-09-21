package com.zhenggq.afterclasswork.pattern.factory;

/**
 * 汽车拥有品牌和颜色
 *
 * @Author: Zhenggq
 * @Date: 2018/9/21 16:58
 * @Description:
 * @Version: 1.0
 */
public interface ICar {

    /**
     * 品牌
     *
     * @return
     */
    String brand();

    /**
     * 颜色
     *
     * @return
     */
    String color();
}
