package com.kh.example.practce2;

import java.util.Scanner;
import com.kh.example.practce2.controller.SnackController;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	// 그저 꾸미기 -- 화면 ------------------------------------------
		System.out.println("스낵류를 입력해주세요.");
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		
		System.out.print("개수 : ");
		int numOf = Integer.parseInt(sc.nextLine());
		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		//----------------------------------------------------------------/
		// --> 즉, 여기까지는 controller 나 model 에 직접 접근X
		 
		 // 데이터들을 서버한테 요청! 서버한데 전달할 때는 controller 로!
		
		SnackController contorller = new SnackController();
		
		// 서버한데 요청해서 응답받은 결과를 다시 화면으로!
		System.out.println(contorller.saveData(kind,name,flavor,numOf,price));
		System.out.println(contorller.confirmDate());
		
		
	}

}
