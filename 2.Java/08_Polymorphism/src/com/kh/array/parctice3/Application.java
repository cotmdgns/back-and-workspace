package com.kh.array.parctice3;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.array.parctice3.controller.ApplicationController;
import com.kh.array.parctice3.model.Book;
import com.kh.array.parctice3.model.Member;



public class Application {

	Scanner sc = new Scanner(System.in);
	Book book = new Book();
	Member member = new Member();
	ApplicationController AC = new ApplicationController();

	public static void main(String[] args) {

		Application a = new Application();
		a.mainMeun();
	
	
	}
	
	
	// 메인메뉴
	public void mainMeun() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		member.setName(name);
	
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		member.setAge(age);

		boolean run = true;
		while(run) {
			System.out.println("=== 메뉴 ===");
			System.out.println("1.마이페이지");
			System.out.println("2.도서 대여하기");
			System.out.println("3.프로그램 종료하기");
			System.out.print("메뉴 번호 :");
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
		System.out.println(member.toString());
		
	}
	// 도서 모음
	public void books() {
		Book b1 = new Book("밥을 지어요", 1,0);
		Book b2 = new Book("오늘은 아무래도 덮밥", 0,0);
		Book b3 = new Book("원피스 108", 0,15);
		Book b4 = new Book("귀멸의 칼날", 0,19);
		Member[] mem = {b1,b2,b3,b4};
		for(int i = 0; i < mem.length;i++) {
			System.out.println(i+1+"번 도서"+mem[i]);
		}
		System.out.println("대여할 도서 번호 선택 : ");
		int num = Integer.parseInt(sc.nextLine());		
		AC.booklist(num);// 이제 조건식 비교
	}
	
}
