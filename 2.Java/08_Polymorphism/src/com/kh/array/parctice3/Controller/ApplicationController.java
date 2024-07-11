package com.kh.array.parctice3.controller;

import java.util.Arrays;

import com.kh.array.parctice3.model.Book;
import com.kh.array.parctice3.model.Member;

public class ApplicationController {
	
	private Member member = new Member();
	private Book book = new Book();
	private Book[] booklist = new Book[2];
	
	public void mydata(String name, int age, int coupon,String title ) {
		// my data
		// 기본적으로 뭐가 있는지 보여주면서
		// 안에다가 배열을 넣어서 
		// booklist에 받은걸 배열에 집어넣기
		member.setName(name);
		member.setAge(age);
		member.setCoupon(coupon);
		book.setTitle(title);
	}

	public int booklist(int num) {
		//book 조건식
		// 대여할 인덱스를 찾고
		// 찾은 인덱스는 false값으로
		// 그리고 mydata에다가 보내기
//		if(num) {
//			System.out.println("성공적으로 대여했습니다");
//		}else {
//			System.out.println("이미 대여한 책입니다");
//		}
		return num;
	}
	


	
	
}
