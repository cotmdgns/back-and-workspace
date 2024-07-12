package com.kh.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import com.kh.practice1.Controller.ApplicationController;
import com.kh.practice1.model.Member;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	private ApplicationController AC = new ApplicationController();
	private Member m = new Member();
	ArrayList<Member> list = new ArrayList();
	
	
	public static void main(String[] args) {
		Application a = new Application();
		a.mainMenu();
		
	}
	
	public void mainMenu() {
		boolean run = true;
		while(run) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 수정");
			System.out.println("7. 가수 명 내림차순 정렬");
			System.out.println("8. 곡 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			try {
				int num = Integer.parseInt(sc.nextLine());
				switch(num) {
				case 1:
					mainMenu1();
					break;
				case 2:
					mainMenu2();
					break;
				case 3:
					mainMenu3();
					break;
				case 4:
					mainMenu4();
					break;
				case 5:
					mainMenu5();
					break;
				case 6:
					mainMenu6();
					break;
				case 7:
					mainMenu7();
					break;
				case 8:
					mainMenu8();
					break;
				case 9:
					System.out.println("종료");
					run = false;
					break;
				default:
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				}
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
	public void mainMenu1() { // 마지막 위치 에 추가할 곡
		System.out.println("**** 마지막 위치에 곡 검색 *****");
		System.out.print("곡 명 : ");
		String sing = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		System.out.println(AC.insert(sing,singer));
	}
	public void mainMenu2() { // 처음 위치 으로 추가할 곡
		System.out.println("**** 첫 위치에 곡 검색 *****");
		System.out.print("곡 명 : ");
		String sing = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		AC.insert2(sing,singer);
	}
	public void mainMenu3() {
		System.out.println("**** 전체 곡 목록 출력 *****");
		System.out.println(	AC.print());
		
	}
	public void mainMenu4() {
		System.out.println("**** 특정 곡 검색 *****");
		System.out.print("검색할 곡 명 : ");
		String sing = sc.nextLine();
		
		AC.searchOn(sing);
	}
	public void mainMenu5() {
		// 특정곡 지우기
		System.out.print("삭제할 곡 명 :");
		String deletesing = sc.nextLine();

		AC.remove(deletesing);
		
	}
	public void mainMenu6() {
		// 특정 곡 수정하기
		System.out.println("**** 특정 곡 수정 *****");
		System.out.print("검색할 곡 명 : ");
		String searchsing = sc.nextLine();
		System.out.print("수정할 곡 명 : ");
		String updatesing = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String updatesinger = sc.nextLine();
		AC.upperData(searchsing, updatesing, updatesinger);	

	}
	public void mainMenu7() {
		//몰라 >:(
	}
	public void mainMenu8() {
		//몰라 >:(		
	}

}
