package com.kh.steap2;

public class Application {

	public static void main(String[] args) {
	// 1. Thread 생성
	GoThread2 go = new GoThread2();
	ComeThread come = new ComeThread();
	
	Thread tGo = new Thread(go,"GoThread");
	Thread tCome = new Thread(come, "ComeThread");
	
	// 2. Start 호출
	tGo.start();
	tCome.start();
	
	}
}
