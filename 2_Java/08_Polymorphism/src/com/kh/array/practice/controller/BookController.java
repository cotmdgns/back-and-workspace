package com.kh.array.practice.controller;

import java.util.ArrayList;

import com.kh.array.practice.model.Book;
import com.kh.array.practice.model.Member;

public class BookController {
	
	private Member member = new Member();
	
	// 내 정보 추가
	public void addMember(String name, int age) {
		member.setName(name);
		member.setAge(age);
	}
	
	// 마이페이지
	public Member myPage() {
		return member;
	}
	
	// 책 대여
	public String rentBook(Book book) {
		ArrayList<Book> bookList = member.getBookList();
		// 이미 대여한 책은 대여 불가능하게 만드는 경우
		for(Book value : bookList) {
			if(value != null&&value.equals(book)) {
				return "이미 대여한 책입니다.";
			}
		}
		
		if(bookList.size() < 2) {
			// 나이 제한 걸기
			if(member.getAge()<book.getAccessAge()) {
				return "나이 제한으로 대여 불가능입니다.";
			}
			
			bookList.add(book);
			
			if(book.isCoupon()) {
				 member.setCoupon(member.getCoupon()+1);
			} 
			return "성공적으로 대여되었습니다.";
		}
		return "더 이상 대여 할수없습니다";
	}
}