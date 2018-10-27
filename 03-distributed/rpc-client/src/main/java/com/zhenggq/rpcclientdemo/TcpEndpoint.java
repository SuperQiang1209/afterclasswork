package com.zhenggq.rpcclientdemo;/**
 * @Author: Zhenggq
 * @Date: 2018/10/27 16:03
 * @Description:
 * @Version: 1.0
 */

import com.zhenggq.rpcdemo.RequestData;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @Author Zhenggq
 * @Date: 2018/10/27 16:03
 * @Version 1.0
 **/
public class TcpEndpoint {

	private String ip;
	private int port;

	public TcpEndpoint(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public <T> T send(RequestData request) {
		try {
			Socket socket = new Socket(ip, port);
			ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
			outputStream.writeObject(request);
			outputStream.flush();

			ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
			T object = (T) inputStream.readObject();

			inputStream.close();
			outputStream.close();
			return object;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
