package com.kh.steap4;


// 프로세스 - 두 스레드 같의 Communication 은 프로세스의 자원으로 해야 한다.
public class InputThredTest {

	boolean check = false;
	
	public static void main(String[] args) {
		
		InputThredTest process = new InputThredTest();
		
		InputThreadStr its = new InputThreadStr(process);
		its.start();
		
		CountThread count = new CountThread(process);
		count.start();
		
	}
}
