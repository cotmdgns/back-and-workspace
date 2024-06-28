package com.kh.opertor;

import java.util.Scanner;

public class F_Triple {

	Scanner sc = new Scanner(System.in);
	
	/*
	 * 삼항 연산자
	 * 
	 * 조건식 ? 값1 : 값2;
	 * 
	 * - 조건식에는 주로 비교, 논리 연산자가 사용된다.
	 * - 조건식의 결과가 true 이면 값1을 반환한다.
	 * - 조건식의 결과가 false 이면 값2를 반환한다.
	 * */
	public static void main(String[] args) {
		F_Triple f = new F_Triple();
		
		//f.method1();
		
		// 실습문제's
		//f.practice1();
		//f.practice2();
		f.practice3();
	}
	
	public void  method1() {
		// 입력받은 정수가 양수인지 음수인지 판단
		System.out.print("정수값 >> ");
		int number = Integer.parseInt(sc.nextLine());
		
		String result = number > 0 ? "양수" : "음수";
		System.out.println(result);
		
		// 0이다 포험
		String result2 = number == 0 ? "0이다" : number > 0 ? "양수" : "음수";
		System.out.println(result2);
	}
	
	/*
	 * 실습문자 1
	 * 사용자한데 두 개의 정수값을 입력받아서 두 정수의 곱셈 결과 100보다 크거나 같은 경우
	 * "결과가 100이상합니다." 아닌 경우 "결과가 100보다 작습니다" 출력
	 * */
	public void practice1() {
		System.out.print("첫번째 정수 값 : ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.print("두번째 정수 값 : ");
		int b = Integer.parseInt(sc.nextLine());
		
		int result = a * b;
		String str = result >= 100 ? "결과가 100이상입니다" : "결과가 100이하입니다"; 
		System.out.println(str);
	}
	/*
	 * 실습문제2
	 * 사용자한데 문자를 하나 입력받아서 문자가 대문자이면
	 * "알파벳 대문자이다." 아닌 경우 "알파벳 대문자가 아니다." 출력
	 * */
	public void practice2() {
		System.out.print("문자를 하나 입력해주세요 : ");
		char a = sc.nextLine().charAt(0);
		
		String str = ('A' <= a && a <= 'Z') ?"알파벳 대문자이다." :"알파벳 대문자가 아니다.";
		System.out.println(str);
	}
	/*
	 * 실습문제 3
	 * 두 정수의 입력받고 + 또는 - 를 입력받아서 계산을 출력
	 * 단, +또는 - 이외의 문자를 입력하는 경우 "잘못 입력했습니다" 출력
	 * 
	 * 예시) 
	 * 첫번째 수 >3
	 * 두번째 수 >4
	 * 
	 * 연산자 입력(+ 또는 - ) >+
	 * 3 + 4 = 7
	 * 
	 * 연산사 입력 (+또는-) *
	 * 잘못 입력했습니다
	 * */
	public void practice3() {
		System.out.print("첫번째 수 > ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.print("두번째 수 > ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.print("연산자 입력 (+또는-) > ");
		char c = sc.nextLine().charAt(0); // + = 43. - = 45
		
		String w = 
				(c == '+') ? a + "+" + b + "=" +(a+b) 
						: (c == '-') ? a + "-" + b + "=" +(a-b)
								: "잘못입력했습니다";
		
		
		
		String w1 = c == '+' 
					? String.format("%d +  %d = %d",a,b,(a+b)) 
					: c == '-' 
						? String.format("%d -  %d = %d",a,b,(a-b))
						: "잘못입력했습니다";
		System.out.println(w1);
	}
	
}
