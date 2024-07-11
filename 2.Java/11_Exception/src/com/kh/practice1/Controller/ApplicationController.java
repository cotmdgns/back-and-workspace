package com.kh.practice1.Controller;

import java.util.ArrayList;

import com.kh.practice1.model.Member;

public class ApplicationController {
	
	
	Member m = new Member();
	ArrayList<Member> list = new ArrayList();
	
	public void insert(String sing, String singer) { //
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getSing().equals(sing) && list.get(i).getSing().equals(singer)) {
				System.out.println("중복된 곡입니다");
				return;
			}
		}
	}
	public void print() {
		for(int i=0; i< list.size(); i++) {
			System.out.println("곡 명 :"+list.get(i).getSing());
			System.out.println("가수 명 :"+list.get(i).getSinger());
		}
	}
}
