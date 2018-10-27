package com.zhenggq.rimserver.impl;/**
 * @Author: Zhenggq
 * @Date: 2018/10/27 00:08
 * @Description:
 * @Version: 1.0
 */

import com.zhenggq.rimserver.IHelloService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @Author Zhenggq
 * @Date: 2018/10/27 00:08
 * @Version 1.0
 **/
public class ServerDemo {

	public static void main(String[] args) throws RemoteException {
		try {
			IHelloService helloService = new HelloServiceImpl();
			LocateRegistry.createRegistry(1099);
			Naming.rebind("rmi://127.0.0.1/Hello", helloService);
			System.out.println("服务启动成功");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
