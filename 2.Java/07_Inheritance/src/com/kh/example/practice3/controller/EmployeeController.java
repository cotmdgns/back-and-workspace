package com.kh.example.practice3.controller;

import com.kh.example.parctice3.model.Employee;

public class EmployeeController {
	
	private Employee e = new Employee();
	
	// 값을 받아내는 공간 이녀석들은 저장공간이랑 나중에 수정할때 불러올꺼야
	// 메인클래스에서 값을 받아와서 ? ㅇㅋ 뭔지 알겠다
	public void add(int empNo, String name, 
			char gender, String phone) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
	}
	// 값을 받아내는 공간2
	public void add(int empNo, String name, 
			char gender, String phone,String 
			dept,int salary, double bouns) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
		e.setDept(dept);
		e.setSalary(salary);
		e.setBouns(bouns);
	}
	
	/*수정을 눌렀을때 호출되는 녀석들*/
	public void modify(String phone) {
		e.setPhone(phone);
	}
	public void modify(double bouns) {
		e.setBouns(bouns);
	}
	public void modify(int salary) {
		e.setSalary(salary);
	}
	
	public String info() { // 데이터 정보 메소드 이기때문에 ? 메소
		return	"Employee [empNo=" + e.getEmpNo() + ", name=" + e.getName() + 
				", gender=" + e.getGender() + ", phone=" + e.getPhone() + 
				", dept="+ e.getDept() +", salary=" + e.getSalary() + 
				", bouns=" + e.getBouns() + "]";
	}
}
