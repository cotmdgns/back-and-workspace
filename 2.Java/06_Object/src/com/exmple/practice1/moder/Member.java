package com.exmple.practice1.moder;

public class Member {
	// private 는 같은 클래스에서만 사용가능 (접근제한자)
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	//getter setter
	
	
	// 그러니 여기서 값을 받고 리턴
	// 클래스 내부에서도 사용
	public Member() {
		
	}
	public void changeName(String name) {
		this.name = name;
	}
	public void printName() {
		System.out.println(name);
	}
}
