package com.zhenggq.afterclasswork.pattern.template;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/23 12:13
 * @Description:
 * @Version: 1.0
 */
public interface ICarRun {

    /**
     * 插入钥匙
     *
     * @return
     */
    void inKey();

    /**
     * 启动汽车
     *
     * @return
     */
    void start();

    /**
     * 加速
     *
     * @return
     */
    void speedUp();

    /**
     * 停车
     *
     * @return
     */
    void stop();
}
