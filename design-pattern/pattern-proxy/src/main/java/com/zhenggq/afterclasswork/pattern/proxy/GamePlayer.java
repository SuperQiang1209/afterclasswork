package com.zhenggq.afterclasswork.pattern.proxy;

/**
 * 游戏玩家:张三
 *
 * @Author: Zhenggq
 * @Date: 2018/9/22 12:48
 * @Description:
 * @Version: 1.0
 */
public class GamePlayer implements IGamePlayer {

    public void Login() {
        System.out.println("张三登录游戏账号");
    }

    public void killBoss() {
        System.out.println("杀死大BOSS!!!");
    }

    public void levelUp() {
        System.out.println("张三游戏账号等级提升!!!");
    }
}
