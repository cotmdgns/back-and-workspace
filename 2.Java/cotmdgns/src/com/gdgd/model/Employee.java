package com.gdgd.model;

public class Employee {
	
	private String name;
	
	public Employee() {
		
	}
	public void ChangeName(String name) {
		this.name = name;
	}
	public void printName() {
		System.out.println(name);
	}
	
}
