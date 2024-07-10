package com.kh.practice1.Controller;

import java.util.ArrayList;

import com.kh.practice1.model.Member;

public class ApplicationController {
	
	
	Member m = new Member();
	ArrayList<Member> list = new ArrayList();
	
	public String endsinger() { // 마지막에 집어넣기
		list.add(new Member(m.getSing(),m.getSinger()));
		return "저장 완료!";
	}
	
	public String firstsinger() { // 첫번째에 집어넣기 
		list.add(0,new Member(m.getSing(),m.getSinger()));
		return "저장 완료!";
	}
	
	public void singPrint() {
		System.out.println(list);
	}
	
	public String info() {
		return null;
	}
	
}
