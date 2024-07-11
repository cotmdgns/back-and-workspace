package com.kh.array.parctice3.model;

public class Book extends Member{
	
	
	private String title;
	private boolean rent;
	private int accessAge;
	public Book() {
		super();
	}
	public Book(String title, int coupon, int accessAge) {
		this.title = title;
		this.coupon = coupon;
		this.accessAge = accessAge;
	}
	public Book(String name, int age, int coupon, String[] bookList,String title,int accessAge,boolean rent) {
		super(name, age, coupon, bookList);
		this.title = title;
		this.accessAge = accessAge;
		this.rent = rent;
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
	public boolean isRent() {
		return rent;
	}
	public void setRent(boolean rent) {
		this.rent = rent;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", coupon=" + coupon + ", accessAge=" + accessAge + "]";
	}
	
	
	
	
}
