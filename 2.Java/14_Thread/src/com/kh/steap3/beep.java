package com.kh.steap3;

public class beep /*extends Thread*/ implements Runnable{
	
	public void run() {
//	 띵띵띵띵띵을 5번 출력하는 작업
	for(int i=0;i<5;i++) {
		System.out.println("띵~");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	
//	상속
//	public void run() {
////		 띵띵띵띵띵을 5번 출력하는 작업
//		for(int i=0;i<5;i++) {
//			System.out.println("띵~");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
	
	//내가 한거
//	public beep(String name) {
//		super(name);
//	}
//	
//	public void run() {
//		for(int i = 0; i < 5; i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			String name = Thread.currentThread().getName();
//			System.out.println(name);
//		}
//	}
}
