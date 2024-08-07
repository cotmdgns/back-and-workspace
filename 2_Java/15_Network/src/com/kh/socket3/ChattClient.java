package com.kh.socket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class ChattClient {

	public static void main(String[] args) {
		
		try {
			InetAddress ip = InetAddress.getLocalHost();
			Socket socket = new Socket(ip, 3000);
			System.out.println("서버와 연결되었습니다..");
			
			SendThread sendThread = new SendThread(socket);
			sendThread.start(); 
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(br != null) {
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			System.out.println("종료");
		}
		
	}

}
