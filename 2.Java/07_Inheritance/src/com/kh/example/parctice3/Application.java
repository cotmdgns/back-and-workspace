package com.kh.example.parctice3;

import java.util.Scanner;

import com.kh.example.parctice3.model.Employee;
import com.kh.example.practice3.controller.EmployeeController;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeController Ec = new EmployeeController();
		Employee E = new Employee();
		
		
		boolean run = true;
		while(run) {
			System.out.println("1.사원 정보 추가");
			System.out.println("2.사원 정보 수정");
			System.out.println("3.사원 정보 출력");
			System.out.println("9.프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num == 1) {
				System.out.print("사원 번호 : ");
				int emp_id = sc.nextInt();

				System.out.print("사원 이름 : ");				
				String name = sc.nextLine();
				
				System.out.print("사원 성별 : ");
				char gender = sc.nextLine().charAt(0);
				
				System.out.print("전화 번호 : ");				
				String phone = sc.nextLine();
				
				Ec.add(emp_id, name, gender, phone);
				
				System.out.print("추가 정보를 더 입력하시겠습니다? (y/n) : ");				
				char aaa = sc.nextLine().charAt(0);
				if(aaa == 'y') {
					System.out.print("사원 부서 : ");				
					String dept_code = sc.nextLine();
					
					System.out.print("사원 연봉 : ");				
					int salary = Integer.parseInt(sc.nextLine());
					
					System.out.print("보너스 율 : ");				
					double bouns = sc.nextDouble();
					Ec.add(emp_id, name, gender, phone,dept_code ,salary ,bouns);
				}else {
					break;
				}
			}
			if(num == 2) {
				
			}
			
		}
		
		
		
		
		
	}

}
