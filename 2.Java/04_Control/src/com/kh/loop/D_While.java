package com.kh.loop;

import java.util.Scanner;

public class D_While {
	
	/*
	 * while 문
	 * 
	 * while(조건식){
	 * 		조건이 true 일 경우 계속 실행
	 * }
	 * */
	// 1~5까지 출력 : for -> while
	public void method1() {
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		int i =1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}
	
	/*
	 * 무한루프 & break 문
	 * - switch, 반복문의 실행을 중지하고 빠져나갈 때 사용
	 * - 반복문이 중첩되는 경우 break문이 포함되어 있는 반복문에서만 빠져나간다. 
	 * */
	public void method2() {
		while(true) {
			System.out.print("숫자 입력: ");
			int num = sc.nextInt();
			System.out.println(num);
			if( num == 0 )break;
		}
	}
	
	/*
	 * do{
	 * 	 실행코드
	 * }while(조건식);
	 * 
	 * - 조건과 상관없이 무조건 한 번은 실행
	 * - 거의 쓸일이 없음...
	 * */
	public void method3() {
		int number = 1;
		
		while(number == 0) {
			System.out.println("while");
		}
		
		do {
			System.out.println("do - while");
		}while(number == 0);
	}
	
	/*
	 * 숫자 맞히기 게임
	 * 
	 * 1과 100사이의 값을 입력해서 임의로 지정한(Random)값을 맞히면 게임 끝!
	 * 게임이 끝나면 몇 번만에 맞혔는지 출력
	 * 
	 * (예 : 57)
	 * 1과 100사이의 값 입력 > 35
	 * 더 큰 수를 입력하세요
	 * 1과 100사의 값 입력 > 70
	 * 더 작은 수를 입력하세요
	 * 1과 100 사이의 값을 입력 > 57
	 * 3번 만에 맞혔습니다
	 * */
	public void method4(){
		double ran = Math.random()*100 +1;
		int ran1 = (int)ran;
		int count = 0;
		while(true) {
			System.out.print("1과 100사의 값 입력 ");
			int num = sc.nextInt();
			
			count++;
			if(num == ran1) {
				System.out.println(count + "번 만에 맞혔습니다.");
				return;
			}else if(num < ran1) {
				System.out.println("더 큰 수를 입력해주세요");
			}else {
				System.out.println("더 작은 수를 입력해주세요");
			}
		}
	}
	
	/*
	 * ---------------------------------
	 * 1. 예금 / 2. 출금 / 3. 잔고 / 4. 종료
	 * ---------------------------------
	 * 선택 > 1
	 * 예금액 > 5000
	 * ---------------------------------
	 * 1. 예금 / 2. 출금 / 3. 잔고 / 4. 종료
	 * ---------------------------------
	 * 선택 > 2
	 * 출금액 > 2000
	 * ---------------------------------
	 * 1. 예금 / 2. 출금 / 3. 잔고 / 4. 종료
	 * --------------------------------- 
	 * 선택 > 3
	 * 출금액 > 3000
	 * ---------------------------------
	 * 1. 예금 / 2. 출금 / 3. 잔고 / 4. 종료
	 * ---------------------------------
	 * 선택 > 4
	 * 프로그램 종료
	 * */
	public void method5() {
		
		int Money = 0;
		boolean ch = true;
		while(ch) {
		System.out.println("-----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-----------------------------");
		System.out.print("선택 > ");
		int num = Integer.parseInt(sc.nextLine());
		switch(num) {
			case 1:
				System.out.print("예금액 > ");
				int inMoney = Integer.parseInt(sc.nextLine());
				Money += inMoney;
				break;
			case 2:
				System.out.print("출금액 > ");
				int outMoney = Integer.parseInt(sc.nextLine());
				if(outMoney > Money) {
					System.out.println("금액이 부족합니다.");
				}
				Money -= outMoney;
				break;
			case 3:
				System.out.println("잔고 :" + Money);
				break;
			case 4:
				System.out.println("프로그램 종료");
				ch = false;
				break;
			}
			//if(num == 4) break;
		}
		/*
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택 > ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num == 1) {
				System.out.print("예금액 > ");
				int inMoney = Integer.parseInt(sc.nextLine());
				Money += inMoney;
				
			}else if(num == 2) {
				System.out.print("출금액 > ");
				int outMoney = Integer.parseInt(sc.nextLine());
				Money -= outMoney;
				if(Money < 0) {
					System.out.println("금액이 부족합니다.");
				}
				
			}else if(num == 3) {
				System.out.println("잔고 :" + Money);
				
			}else {
				System.out.println("프로그램 종료");
				return;
			}
		}
		*/
	}
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		D_While d = new D_While();
		//d.method1();
		//d.method2();
		//d.method3();
		//d.method4();
		d.method5();
		
	}

}
