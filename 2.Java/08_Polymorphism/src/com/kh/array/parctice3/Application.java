package com.kh.array.parctice3;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.array.parctice3.model.Book;
import com.kh.array.parctice3.model.Member;



public class Application {

	Scanner sc = new Scanner(System.in);
	Book book = new Book();
	Member member = new Member();
	

	public static void main(String[] args) {

		Application a = new Application();
		a.mainMeun();
	
	
	}
	
	
	// 메인메뉴
	public void mainMeun() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();

	
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());


		

		boolean run = true;
		while(run) {
			System.out.println("=== 메뉴 ===");
			System.out.println("1.마이페이지");
			System.out.println("2.도서 대여하기");
			System.out.println("3.프로그램 종료하기");
			System.out.println("메뉴 번화 :");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1:
				mypage();
				break;
			case 2:
				books();
				break;
			case 3:
				run = false;
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}	
		}	
	}
	
	// 개인정보 입력란
	public void mypage() {

	}
	// 도서 모음
	public void books() {

		System.out.println("1번도서: ");
		System.out.println("2번도서: ");
		System.out.println("3번도서: ");
		System.out.println("4번도서: ");
		System.out.println("대여할도서번호선택 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println("성공적으로 대여했습니다");
		
		Book[] book = new Book[4];
		book[0] = new Book("밥을 지어요", 1,0);
		book[1] = new Book("오늘은 아무래도 덮밥",0,0);
		book[2] = new Book("원피스 108",0,15);
		book[3] = new Book("귀멸의 칼날 23", 0,19);

	}
	
}
