package com.zhenggq.rpcclientdemo;

import java.lang.reflect.Proxy;

/**
 * @Author: Zhenggq
 * @Date: 2018/10/27 16:05
 * @Description:
 * @Version: 1.0
 */
public class RpcClient {

	public <T> T clientProxy(final Class<?> interfaceClass, String ip, int port) {
		return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(),
				new Class<?>[]{interfaceClass}, new RemoteInvocationHandler(ip, port));
	}


}
