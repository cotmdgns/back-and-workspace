package com.kh.array.parctice3.model;

public class book2 {
	
	private String title;
	private boolean coupon;
	private int accessAge;
	public book2() {
	}
	public book2(String title, boolean coupon, int accessAge) {
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
	public boolean isCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	public int getAccessAge() {
		return accessAge;
	}
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	
	
	@Override
	public String toString() {
		return "book2 [title=" + title + ", coupon=" + coupon + ", accessAge=" + accessAge + "]";
	}
	
	
	
}
