package com.kh.array.parctice3.model;

import java.util.Arrays;

public class Member {
	
	protected String name;
	protected int age;
	protected int coupon;
	protected String[] bookList;
	
	public Member() {
	}
	public Member(String name, int age, int coupon, String[] bookList) {
		this.name = name;
		this.age = age;
		this.coupon = coupon;
		this.bookList = bookList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	public String[] getBookList() {
		return bookList;
	}
	public void setBookList(String[] bookList) {
		this.bookList = bookList;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", coupon=" + coupon + ", bookList="
				+"["+ bookList +","+ bookList+"]" + "]";
	}
	
	
	
}
