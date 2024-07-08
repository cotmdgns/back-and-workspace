package com.kh.example.parctice3;

import java.util.Scanner;

import com.kh.example.parctice3.model.Employee;
import com.kh.example.practice3.controller.EmployeeController;

public class Application {

	Scanner sc = new Scanner(System.in);
	EmployeeController Ec = new EmployeeController();
	Employee E = new Employee();

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Application a = new Application();

		
		boolean run = true;
		while(run) {
			System.out.println("1.사원 정보 추가");
			System.out.println("2.사원 정보 수정");
			System.out.println("3.사원 정보 출력");
			System.out.println("9.프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			a.employeeMenu(num); // 메뉴 선택 버튼
		}
	}

	
	//쌤이 나중에 쪼개고 쪼갠다 했으니깐 쪼갠다는 의미가 이거겠지?
	
	public int employeeMenu(int num){//메인 메뉴를 출력하는 메소드 	// 메인메뉴		
		if(num == 1) { // 1번 저장
			insertEmp();
		}else if(num == 2) { // 2번 수정
			updateEmp();
		}else if(num == 3) { // 3번 출력
			printEmp();
		}else if(num == 9) {
			return num;
		}
		return num;
	}
	
	
	
	public void insertEmp() { // 저장할 데이터를 사용자에게 받는 메서드 // 1번
		System.out.print("사원 번호 : ");
		int emp_no = Integer.parseInt(sc.nextLine());
		
		System.out.print("사원 이름 : ");				
		String name = sc.nextLine();
		
		System.out.print("사원 성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("전화 번호 : ");				
		String phone = sc.nextLine();
		
		Ec.add(emp_no, name, gender, phone); //E.에 저장한걸 다시 콘솔에 저장
		
		System.out.print("추가 정보를 더 입력하시겠습니다? (y/n) : ");				
		char aaa = sc.nextLine().charAt(0);
		if(aaa == 'y') {
			System.out.print("사원 부서 : ");				
			String dept_code = sc.nextLine();
			
			System.out.print("사원 연봉 : ");				
			int salary = Integer.parseInt(sc.nextLine());
			
			System.out.print("보너스 율 : ");				
			double bouns =  Double.parseDouble(sc.nextLine());
			
			Ec.add(emp_no, name, gender, phone, dept_code, salary, bouns);
		}
	}
	
	
	
	public void updateEmp() {// 수정할 데이터를 사용자에게 받는 메소드 // 2번
		System.out.println("사원의 어떤 정보를 수정하겠습니까? : ");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.print("메뉴 번호를 누르세요 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		if(num2 == 1) {
			System.out.print("전화 번호 : ");				
			String phone = sc.nextLine();
			Ec.modify(phone);
		}else if(num2 == 2){
			System.out.print("사원 연봉 : ");				
			int salary = Integer.parseInt(sc.nextLine());
			Ec.modify(salary);
		}else if(num2 == 3) {
			System.out.print("보너스 율 : ");				
			double bouns =  Double.parseDouble(sc.nextLine());
			Ec.modify(bouns);
		}
	}

	public void printEmp() { // 데이터를 출력하는 메소드 			//3번	
		System.out.println(Ec.info());
	}
}
