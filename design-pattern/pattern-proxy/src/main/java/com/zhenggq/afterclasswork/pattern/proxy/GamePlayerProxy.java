package com.zhenggq.afterclasswork.pattern.proxy;

import java.lang.reflect.Method;

/**
 * 游戏代练
 *
 * @Author: Zhenggq
 * @Date: 2018/9/22 12:50
 * @Description:
 * @Version: 1.0
 */
public class GamePlayerProxy implements ZGQInvocationHandler {

    private IGamePlayer player;

    public Object getInstance(IGamePlayer player) {
        this.player = player;
        Class clazz = player.getClass();

        return ZGQProxy.newProxyInstance(new ZGQClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(this.player, args);
        return null;
    }

}
