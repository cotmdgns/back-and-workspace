package com.kh.practice1.Controller;

import java.util.ArrayList;

import com.kh.practice1.model.Member;

public class ApplicationController {
	
	
	Member m = new Member();
	ArrayList<Member> list = new ArrayList();
	
	public void insert(String sing, String singer) { // 마지막에 추가하기
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getSing().equals(sing)) {
				System.out.println("중복된 곡입니다");
				return;
			}
		}
		list.add(new Member(sing, singer));
        System.out.println("추가 성공!");
	}
	
	public void insert2(String sing, String singer) { // 처음에 추가하기
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getSing().equals(sing)) {
				System.out.println("중복된 곡입니다");
				return;
			}
		}
		list.add(0,new Member(sing, singer));
        System.out.println("추가 성공!");
	}
	
	public void print() { // 곡 추가
		for(int i = 0; i<list.size(); i++) {
			System.out.println("곡 명 :"+list.get(i).getSing());
			System.out.println("가수 명 :"+list.get(i).getSinger());
		}
	}
	
	public void searchOn(String sing) { //곡 검색하기
		for(int i = 0; i<list.size()+1; i++) {
			if(i == list.size()) {System.out.println("없습니다") ;break;} 
			if(list.get(i).getSing().equals(sing)) {
				System.out.println(list.get(i).getSing()+"-"+list.get(i).getSinger()+"을 검색 했습니다.");break;
			}
		}
	}
	public void remove(String deletesing) { //곡 지우기
		for(int i = 0; i<list.size()+1; i++) {
			if(i == list.size()) {System.out.println("없습니다") ;break;} 
			if(list.get(i).getSing().equals(deletesing)) {
				list.remove(i);break;
			}
		}
	}
	public void upperData(String searchsing,String sing,String singer) { //곡 업데이트하기
		for(int i = 0; i<list.size()+1; i++) {
			if(i == list.size()) {
				System.out.println("없습니다") ;break;
			} 
			if(list.get(i).getSing().equals(searchsing)) {
				m.setSing(sing);
				m.setSinger(singer);
				list.set(i,new Member(sing,singer));
				break;
			}
		}
	}
	
}
