package com.zhenggq.rpcclientdemo;

import com.zhenggq.rpcdemo.RequestData;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author Zhenggq
 * @Date: 2018/10/27 15:59
 * @Version 1.0
 **/
public class RemoteInvocationHandler implements InvocationHandler {

	private String ip;
	private int port;

	public RemoteInvocationHandler(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		RequestData request = new RequestData(proxy.getClass().getCanonicalName(), method.getName(), args);
		TcpEndpoint tcp = new TcpEndpoint(ip, port);
		return tcp.send(request);
	}
}
