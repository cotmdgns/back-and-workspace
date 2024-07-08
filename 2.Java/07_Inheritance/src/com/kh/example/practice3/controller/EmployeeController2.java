package com.kh.example.practice3.controller;

import com.kh.example.parctice3.model.Employee;

//********
//쌤이 한거
//********
public class EmployeeController2 {
	
	private Employee employee = new Employee();
	
	// 오버로딩!!!
	public void add(int empNo, String name, char gender, String phone) {
		employee.setEmpNo(empNo);
		employee.setName(name);
		employee.setGender(gender);
		employee.setPhone(phone);
	}
	
	public void add(int empNo, String name, char gender, String phone, String dept ,int salay, double bouns) {
		employee.setEmpNo(empNo);
		employee.setName(name);
		employee.setGender(gender);
		employee.setPhone(phone);
		employee.setEmpNo(empNo);
		employee.setSalary(salay);
		employee.setBouns(bouns);
	}
	
	public void modify(String phone) {
		employee.setPhone(phone);
	}
	
	public void modify(int salary) {
		employee.setSalary(salary);
	}	
	public void modify(double bouns) {
		employee.setBouns(bouns);
	}
	
	public Employee info() {
		return employee;
	}
	
}
