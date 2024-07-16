package com.kh.steap5;

public class User2 extends Thread{

	private Calculator calculator;
	
	public void setCalculater(Calculator calculator) {
		setName("CalculatorUser2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
	
}
