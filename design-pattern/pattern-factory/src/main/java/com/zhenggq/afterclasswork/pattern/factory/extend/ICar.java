package com.zhenggq.afterclasswork.pattern.factory.extend;

/**
 * 业务升级，各汽车工厂也可以生产各种颜色的汽车
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
