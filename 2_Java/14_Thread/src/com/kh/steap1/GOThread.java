package com.kh.steap1;

/*
 * 스레드 생성하는 방법
 * 
 * 1. Thread 클래스를 상속받는다.
 * 2. run() 메서드를 오버라이딩 한다.
 * 3. Thread 클래스를 상송한 자식 클래스의 객체 생성 후 start() 메서드 호출한다.
 * */

public class GOThread extends Thread{
	
	public GOThread(String name) {
		super(name);
	}
	
	// 스레드가 작동하는 부분
	public void run() {
		for(int i=0;i<20;i++) {
			try {
				Thread.sleep(1000); // 지정된 시간동안 스레드를 멈추게 하는 역활
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String name = Thread.currentThread().getName();
			System.out.println("CurrentThread : " + name + "," + i);
		}
	}
}
