package com.kh.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.kh.practice1.Controller.ApplicationController;
import com.kh.practice1.model.Member;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	private ApplicationController AC = new ApplicationController();
	private Member m = new Member();
	
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
			
		}
	}
	public void mainMenu1() { // 마지막 위치 에 추가할 곡
		System.out.println("**** 첫 위치에 곡 검색 *****");
		System.out.print("곡 명 : ");
		String sing = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		Member m = new Member(sing,singer); // 일단 member 에 추가
		System.out.println(AC.endsinger());
		//이제 컨트롤에 추가하기
		// 컨트롤에서 리턴 "추가 성공!"
	}
	public void mainMenu2() { // 처음 위치 으로 추가할 곡
		// 추가할때 배열로 받아서
		System.out.println("**** 첫 위치에 곡 검색 *****");
		System.out.print("곡 명 : ");
		String sing = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		Member m = new Member(sing,singer); // 일단 member 에 추가
		 AC.firstsinger();
		//이제 컨트롤에 추가하기
		// 컨트롤에서 리턴 "추가 성공!"
	}
	public void mainMenu3() {
		System.out.println("**** 전체 곡 목록 출력 *****");
		// 컨트롤에서 2번에 저장된걸 다시 출력 (get 이든 메서드를 출력하든)		
	}
	public void mainMenu4() {
		System.out.println("**** 특정 곡 검색 *****");
		System.out.print("검색할 곡 명 : ");
		String sing = sc.nextLine();
		// 입력받은 값이 있는지 비교하고
		// 있으면 리턴해서 가져오기
	}
	public void mainMenu5() {
		// 특정곡 지우기
		System.out.print("삭제할 곡 명 :");
		String deletesing = sc.nextLine();
		//조건문으로 있는지 확인하고
		//없다면 "삭제할 곡이 없습니다."
		//있다면 "(수정)가수명 - (수정)곡명 을 삭제 했습니다.
	}
	public void mainMenu6() {
		// 특정 곡 수정하기
		System.out.println("**** 특정 곡 수정 *****");
		System.out.print("검색할 곡 명 : ");
		String searchsing = sc.nextLine();
		// 조건문으로 저정된 컨트롤에 검색할 가수가 있는지 확인하고 있다면 수정
		// 있다면 "(수정) 가수명 - (수정) 곡명 의 값이 변경되었습니다.
		// 없다면 "수정할 곳을 찾지 못했습니다"
		System.out.print("수정할 곡 명 : ");
		String updatesing = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String updatesinger = sc.nextLine();
	}
	public void mainMenu7() {
		//곡 내림차순
	}
	public void mainMenu8() {
		//곡 오름차운
	}

}
