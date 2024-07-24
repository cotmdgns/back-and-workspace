package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {
	
	public static void main(String[] args) {
		VariablePractice varia = new VariablePractice();
		
		System.out.println("---------- 1번째 문제 ------------");
		varia.method1();
		System.out.println("---------- 2번째 문제 ------------");
		varia.method2();
		System.out.println("---------- 3번째 문제 ------------");
		varia.method3();
		System.out.println("---------- 4번째 문제 ------------");
		varia.method4();
		System.out.println("---------- 5번째 문제 ------------");
		varia.method5();
		System.out.println("---------- 6번째 문제 ------------");
		varia.method6();
		System.out.println("---------- 7번째 문제 ------------");
		varia.method7();
		
	}
	
	/*
	 * 영화관의 요금표는 다음과 같다.
	 *  - 성인 : 10000원
	 *  - 청소년 : 7000원
	 * 
	 * 성인 2명과 청소년 3명이 영화를 보려고 할 때 지불해야 할 금액을 계산 후 출력하세요.
	 * */
	public void method1() {
		int adult = 10000;
		int Teenager = 7000;
		int adultcount = 2;
		int Teenagercount = 3;
		int result = adult * adultcount + Teenager * Teenagercount;
		System.out.println("합계 "+result+"원");
	}
	
	/*
	 * x=5, y=7, z=9의 값을 직접 변경하지 않고 변수를 사용하여
	 * 
	 * x=7
	 * y=9
	 * z=5
	 * 
	 * 로 출력하세요.
	 * */
	public void method2() {
		int x = 5;
		int y = 7;
		int z = 9;
		
		int change;
		
		change = x;
		x = y;
		y = z;
		z = change;
		
		System.out.println("x :" + x);
		System.out.println("y :" + y);
		System.out.println("z :" + z);
	}

	/*
	 * 정수 두 개를 입력 받아 두 수의 합(+), 차(-), 곱(*), 나누기(/)한 몫을 출력하세요.
	 * 
	 * 첫 번째 정수 : 23
	 * 두 번째 정수 : 7
	 * 더하기 : 30
	 * 빼기 : 16
	 * 곱하기 : 161
	 * 나누기 몫 : 3
	 * */
	public void method3() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int a = Integer.parseInt(sc1.nextLine());
		System.out.print("두 번째 정수 : ");
		int b = Integer.parseInt(sc1.nextLine());
		
		System.out.printf("더하기 :%d\n빼기 :%d\n곱하기 :%d\n나누기 몫: %d\n",a+b,a-b,a*b,a/b);
	}

	/**
	 * 키보드로 가로, 세로 값을 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
	 * 공식) 면적 : 가로 * 세로
	 *       둘레 : (가로 + 세로) * 2
	 * 
	 * 가로 : 13.5
	 * 세로 : 41.7
	 * 면적 : 562.95
	 * 둘레 : 110.4
	 */
	public void method4() {
		Scanner sc2 = new Scanner(System.in);
		System.out.print("가로 : ");
		double garo = Double.parseDouble(sc2.nextLine());
		System.out.print("세로 : ");
		double saro = Double.parseDouble(sc2.nextLine());
		
		System.out.println("면적 : " + garo * saro );
		System.out.println("둘레 : " + (garo + saro) *2);
	}

	/*
	 * 영어 문자열 값을 입력 받아 문자에서 첫번째, 두번째, 마지막 글자를 출력하세요.
	 * 
	 * 문자열을 입력하세요 : apple
	 * 첫번째 문자 : a
	 * 두번째 문자 : p
	 * 마지막 문자 : e
	 * */
	public void method5() {
		Scanner sc3 = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc3.nextLine();
		
		char a = str.charAt(0);
		char b = str.charAt(1);
		char c = str.charAt(str.length()-1);
		
		
		System.out.println("첫번째 문자 :" + a);
		System.out.println("첫번째 문자 :" + b);
		System.out.println("첫번째 문자 :" + c);
		
	}

	/*
	 * 문자 하나를 입력 받아 그 문자와 다음 문자의 유니코드를 출력하세요.
	 * 
	 * 문자 : A
	 * A unicode : 65
	 * B unicode : 66
	 * */
	public void method6() {
		Scanner sc4 = new Scanner(System.in);
		System.out.print("문자 : ");
		char ch = sc4.nextLine().charAt(0);
		int ch1 = ch;
		
		System.out.println(ch + " unicode :"+ ch1);
	}
	
	/*
	 * 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
	 * 
	 * 국어 : 75
	 * 영어 : 63
	 * 수학 : 80
	 * 총점 : 218
	 * 평균 : 72.67
	 * */
	public void method7() {
		Scanner sc5 = new Scanner(System.in);
		System.out.print("국어 : ");
		int a = Integer.parseInt(sc5.nextLine());
		System.out.print("영어 : ");
		int b = Integer.parseInt(sc5.nextLine());
		System.out.print("수학 : ");
		int c = Integer.parseInt(sc5.nextLine());
		
		int sum = a+b+c;
		double avg = (double)(a+b+c)/3;
		System.out.println("총점 : "+sum);
		System.out.printf("평균 : %.2f",avg);
	}

}
