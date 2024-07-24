package com.kh.parctice;

import java.util.Scanner;

public class OperatorPractice {
    
	Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		OperatorPractice o = new OperatorPractice();
		//o.method1();
		//o.method2();
		//o.method3();
		//o.method4();
		//o.method5();
		o.method6();
		o.method7();
		
	}

	
	//모든 사람이 연필을 골고루 나눠가지려고 한다. 인원 수와 연필 개수를 입력 받고 
	//1인당 동일하게 나눠가진 연필 개수와 나눠주고 남은 연필의 개수를 출력하세요.
	public void method1() {
		
		System.out.print("인원 수를 입력해주세요 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("연필 개수 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		int num3 = num1 / num2;
		int num4 = num1 % num2;
		
		System.out.println("1인당 연필 개수 : "+num3);
		System.out.println("연필 남은 : "+num4);
		
	}
	
	//입력 받은 숫자를 산술 연산자만 사용해서 십의 자리 이하는 버리는 코드를 작성하세요.
	//만약 432이라면 400, 111이라면 100이 출력됩니다.
	public void method2() {
		System.out.print("입력 받을 숫자 : ");
		int a = Integer.parseInt(sc.nextLine());
		int b = a / 100;
		System.out.println(b * 100);
		
		
	}

	//3개의 수를 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
	public void method3() {
		System.out.print("첫번째 정수 : ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.print("첫번째 정수 : ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.print("첫번째 정수 : ");
		int c = Integer.parseInt(sc.nextLine());
		
		boolean w = (a == b) && (b == c);
		System.out.println(w);
	}

	//입력 받은 하나의 정수가 짝수이면 "짝수다", 짝수가 아니면 "짝수가 아니다"를 출력하세요.
	public void method4() {
		System.out.print("입력 받을 수 : ");
		int a = Integer.parseInt(sc.nextLine());
		
		String str = (a % 2 == 0) ? "짝수임":"짝수아님";
		System.out.println(str);
		
	}

	//주민번호(-포함)를 입력받아 남자인지 여자인지 구분하여 출력하세요
	public void method5() {
		System.out.print("주민번호 입력(-포함) : ");
		char a = sc.nextLine().charAt(7);
		System.out.println(a == '1' || a == '3' ? "남자" : "여자");
				
	}

	//나이를 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
	public void method6() {
		System.out.print("나이 입력해주세요 : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println( a <= 13 ? "어린이" : a <= 19 ? "청소년" : "성인");
	}

	//사과의 개수와 바구니의 크기(바구니 1개의 들어가는 사과의 개수)를 입력받아
	//필요한 바구니의 수를 출력하세요
	public void method7() {
		System.out.print("사과 개수 : ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.print("바구니의 크기 : ");
		int b = Integer.parseInt(sc.nextLine());
		
		int c = a % b == 0 ? a/b : a/b+1;
		System.out.println("바구니 개수 : " + c);
	}
	
}