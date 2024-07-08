package com.kh.array.parctice3.model;

public class Member {
	private String nama;
	private int age;
	private String title;
	private int coupon;
	private String bookList;
	private String accessAge;
	public Member() {
	}
	public Member(String nama, int age, String title, int coupon, String bookList, String accessAge) {
		this.nama = nama;
		this.age = age;
		this.title = title;
		this.coupon = coupon;
		this.bookList = bookList;
		this.accessAge = accessAge;
	}
	
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	public String getBookList() {
		return bookList;
	}
	public void setBookList(String bookList) {
		this.bookList = bookList;
	}
	public String getAccessAge() {
		return accessAge;
	}
	public void setAccessAge(String accessAge) {
		this.accessAge = accessAge;
	}
	
	
	@Override
	public String toString() {
		return "Member [nama=" + nama + ", age=" + age + ", title=" + title + ", coupon=" + coupon + ", bookList="
				+ bookList + ", accessAge=" + accessAge + "]";
	}
	
	
	
}
