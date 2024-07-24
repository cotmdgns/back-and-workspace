package com.kh.step3;

import com.kh.step3.model.Calculator;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * 변수 호출 방법
		 * - 참조변수.변수;
		 * 
		 * 메소드 호출 방법
		 * -참조변수.메서드명(); // 매개변수가 없는 경우
		 * -참조변수.메서드명(값1, 값2,...) // 매개변수가 있을 경우
		 * */
		Calculator cal1 = new Calculator();
		
		
		cal1.a = 3;
		cal1.b = 98;
		
		System.out.println("더하기 : " + cal1.add());
		System.out.println("빼기 : " + cal1.substract());
		System.out.println("곱하기 : " + cal1.multiply(100,200));
		
		System.out.println("몫 or 나누기 : "+Calculator.divdie(cal1.b,cal1.a));
		
		System.out.println("팩토리얼 : " + cal1.factorial(10));
		System.out.println("팩토리얼 : " + cal1.factorial2(10));
		
	}

}
