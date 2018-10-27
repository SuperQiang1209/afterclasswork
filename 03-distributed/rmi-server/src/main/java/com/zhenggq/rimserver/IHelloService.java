package com.zhenggq.rimserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author: Zhenggq
 * @Date: 2018/10/27 00:07
 * @Description:
 * @Version: 1.0
 */
public interface IHelloService extends Remote {

	String sayHello(String msg) throws RemoteException;
}
