package com.zhenggq.rpcdemo;/**
 * @Author: Zhenggq
 * @Date: 2018/10/27 10:52
 * @Description:
 * @Version: 1.0
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author Zhenggq
 * @Date: 2018/10/27 10:52
 * @Version 1.0
 **/
public class RpcServer {

	private static final ExecutorService executorService = Executors.newCachedThreadPool();

	private Object service;


	private int port;

	public RpcServer(Object service, int port) {
		this.service = service;
		this.port = port;
	}

	public void publish() {
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("服务发布成功");
			while (true) {
				Socket socket = serverSocket.accept();
				executorService.execute(new ProcessorHandler(socket, service));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
