package com.zhenggq.afterclasswork.pattern.proxy;

import java.lang.reflect.Method;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/22 12:44
 * @Description:
 * @Version: 1.0
 */
public interface ZGQInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
