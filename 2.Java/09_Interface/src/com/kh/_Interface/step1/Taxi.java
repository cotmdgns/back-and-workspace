package com.kh._Interface.step1;

public class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("택시 달린다");
	}

	@Override
	public void turn() {
		System.out.println("택시 돈다");
	}

}
