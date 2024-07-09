package com.kh.example.parctice3;

import java.util.Scanner;

import com.kh.example.parctice3.model.Employee2;
import com.kh.example.practice3.controller.EmployeeController2;
//********
// 쌤이 한거
//********
public class Application2 {

	Scanner sc = new Scanner(System.in);
	Employee2 viewEmployee = new Employee2();
	EmployeeController2 Ec2 = new EmployeeController2(); 
	
	public static void main(String[] args) {
		Application2 a = new Application2();
		
		boolean run = true;
		while(run) {
			int select = a.employeeMenu();
			switch(select) {
			case 1:
				a.intsertEmp();
				break;
			case 2:
				a.updateEmp();
				break;
			case 3:
				a.printEmp();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요~");
			}
		}
	}

	// 메인 메뉴를 출력하는 메서드
	public int employeeMenu() {
		System.out.println("1. 사원정보 추가");
		System.out.println("2. 사원정보 수정");
		System.out.println("3. 사원정보 출력");
		System.out.println("9. 프로그램 종료");
		System.out.print("메인 번호를 누르세요 : ");
		return Integer.parseInt(sc.nextLine());
	}
	// 저장할 데이터를 사용자에게 받는 메서도
	public void intsertEmp() {
		System.out.print("사원 번호 : ");
		//int empNo= Integer.parseInt(sc.nextLine());
		viewEmployee.setEmpNo(Integer.parseInt(sc.nextLine()));
		System.out.print("사원 이름 : ");
		//String name = sc.nextLine();
		viewEmployee.setName(sc.nextLine());
		System.out.print("사원 성별 : ");
		//char gender = sc.nextLine().charAt(0);
		viewEmployee.setGender(sc.nextLine().charAt(0));
		System.out.print("전화 번호 : ");
		//String phone = sc.nextLine();
		viewEmployee.setPhone(sc.nextLine());
		System.out.print("추가 정보를 더 입력하겠습니까?(y/n)");
		char add = sc.nextLine().charAt(0);
		if(add == 'y') {
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			System.out.print("사원 연봉 : ");
			int salary = Integer.parseInt(sc.nextLine());
			System.out.print("보너스 율 : ");
			double bouns = Double.parseDouble(sc.nextLine());
			Ec2.add(viewEmployee.getEmpNo(),
					viewEmployee.getName(),
					viewEmployee.getGender(),
					viewEmployee.getPhone(), dept, salary, bouns);
		}else {
			Ec2.add(viewEmployee.getEmpNo(),
					viewEmployee.getName(),
					viewEmployee.getGender(),
					viewEmployee.getPhone());
		}
	}
	// 수정할 데이터를 사용자에게 받는 메서드
	public void updateEmp() {
		System.out.println("사원의 어떤 정보를 수정하시겠습니까 ? ");
		System.out.println("1. 전화 번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		int select = Integer.parseInt(sc.nextLine());
		
		switch(select) {
		case 1:
			System.out.println("전화 번호 입력 : ");
			String phone = sc.nextLine();
			Ec2.modify(phone);
			break;
		case 2:
			System.out.println("사원 연봉 입력 : ");
			int salary = Integer.parseInt(sc.nextLine());
			Ec2.modify(salary);
			break;
		case 3:
			System.out.println("보너스 율 입력 : ");
			double bouns = Double.parseDouble(sc.nextLine());
			Ec2.modify(bouns);
			break;
		case 9:
			break;
		}
	}
	// 데이터를 출력하는 메서드
	public void printEmp() {
		System.out.println(Ec2.info());
	}

	

}
