package com.kh.polymorphism.controller;

import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.parent.Employee;

public class EmployeeController {
	private Employee employee = new Employee();
	
	// 이름으로 사람 찾기
	public Employee findEmployeeByName(String name, Employee[] empArr) {
		for(int i=0; i<empArr.length;i++) {
			if(empArr[i].getName().equals(name)) {
				return empArr[i];
			}
		}
		return null;
	}
	
	
	
//	public Employee findEmployeeByName(String name, Employee[] empArr) {
//		for(int i=0; i<empArr.length;i++) {
//			if(empArr[i].getName().equals(name)) {
//				return empArr[i];
//			}
//		}
//		return null;
//	}
	// 찾은 사람의 연봉은?

	public int getAnnualSalary(Employee result, Employee[] empArr) {
		for(int i = 0 ; i < empArr.length ; i++) {
			if(empArr[i].getName().equals(result.getName())) {
				Engineer e = new Engineer();
				return empArr[i].getSalary()*12+e.getBonus();
			}
		}
		return 0;
	}
	

//	// 쌤이한거
//	public int getAnnualSalary(Employee e) {
//		if(e instanceof Engineer) { // 특정 자식 객체 찾는 방법!
//			Engineer engineer = (Engineer) e; // 부모 -> 자식 : 강제 형 변환!
//			return e.getSalary() * 12 + engineer.getBonus();
//		}
//		return e.getSalary() * 12;
//	}
	
	// 전체 사람들의 연봉 총합은
	
	public int getTotalSalary(Employee[] empArr) {
		int sum = 0;
		for(int i=0; i<empArr.length;i++) {
			Engineer e = new Engineer();
			sum += empArr[i].getSalary()*12 + e.getBonus();
		}
		return sum;
	}
	

	
//	public int getTotalSalary(Employee[] empArr) {
//		int sum = 0;
//		for(Employee employee : empArr) {
//			sum += getAnnualSalary(employee);
//		}
//		return sum;
//	}
}
