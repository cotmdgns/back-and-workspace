package com.kh.array.parctice3;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.array.parctice3.model.Member2;
import com.kh.array.parctice3.model.book2;

public class Application2 {
	
	Scanner sc = new Scanner(System.in);
	Member2 member2 = new Member2();
	book2 book2 = new book2();
	book2[] book = {new book2("밥을 지어요", true, 0),
					new book2("오늘은 아무래도 덮밥",false,0),
					new book2("원피스 108", false,15),
					new book2("귀멸의 칼날 23",false,19)};
	
	public static void main(String[] args) {
		Application2 app = new Application2();
		app.menu();
	}
	
	public void menu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		member2.setName(name);
		
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		member2.setAge(age);
		
		boolean run = true;
		while(run) {
			System.out.println("====== 메뉴 ======");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 대여하기");
			System.out.println("3. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int number = Integer.parseInt(sc.nextLine());
			
			switch(number) {
			case 1:
				System.out.println(member2);
				break;
			case 2:
				for(int i =0; i< book.length; i++) {
					System.out.println((i+1)+"번 도서 :"+book[i]);
				}
				System.out.println("대여할 도서 번호 선택 : ");
				int select = Integer.parseInt(sc.nextLine());
				// select(index+1) 번호에 따라서 해당 책이 Member - bookList에 추가
				member2.getBookList()[0] = book[select-1];
				
				
				
				break;
			case 3:
				System.out.println("프로그램 종료하기");
				run = false;
				break;
			default:
				System.out.println("잘못입력했습니다.");
			}
		}
		
	}
	public void qwe() {
		
	}

}
