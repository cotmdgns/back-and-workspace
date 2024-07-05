package com.kh.example.practice3.controller;

import com.kh.example.parctice3.model.Employee;

public class EmployeeController {
	
	private Employee e = new Employee();
	
	
	// 값을 받아내는 공간, 만약 수정을 안하면 이녀석만 호출
	public void add(int empNo, String name, 
			char gender, String phone) {
				
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
	}
	// 값을 받아내는 공간2 , 만약 수정까지 하게 된다면 이녀석이 호출
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
}
