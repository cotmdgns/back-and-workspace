package com.kh._Interface.step1;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스 달린다");
	}

	@Override
	public void turn() {
		System.out.println("버스 돈다");
	}

}
