package com.kh.steap5;

public class User1 extends Thread{

	private Calculator calculator;
	
	public void setCalculater(Calculator calculator) {
		setName("CalculatorUser1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
	
}
