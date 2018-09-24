package com.zhenggq.afterclasswork.pattern.proxy;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/22 12:44
 * @Description:
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        IGamePlayer proxy = (IGamePlayer) new GamePlayerProxy().getInstance(new GamePlayer());
        System.out.println("==="+proxy);

        proxy.Login();
        proxy.killBoss();
        proxy.levelUp();

    }

}
