package com.kh.array.parctice3.model;

public class Book extends Member{
	
	
	protected String title;
	protected int accessAge;
	
	public Book() {
	}
	public Book(String title, int coupon, int accessAge) {
		this.title = title;
		this.coupon = coupon;
		this.accessAge = accessAge;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAccessAge() {
		return accessAge;
	}
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", coupon=" + coupon + ", accessAge=" + accessAge +  "]";
	}
	
	
}