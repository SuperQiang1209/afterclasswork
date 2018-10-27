package com.zhenggq.rpcdemo;

/**
 * @Author Zhenggq
 * @Date: 2018/10/27 16:29
 * @Description:
 * @Version 1.0
 **/
public class ServiceDemo {

	public static void main(String[] args) {

		IHelloWord helloWord = new HelloWordImpl();
		RpcServer service = new RpcServer(helloWord, 2333);
		service.publish();
	}
}
