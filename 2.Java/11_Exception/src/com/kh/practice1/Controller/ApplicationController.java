package com.kh.practice1.Controller;

import java.util.ArrayList;
import java.util.Comparator;

import com.kh.practice1.model.Member;

public class ApplicationController {
	
	
	Member m = new Member();
	ArrayList<Member> list = new ArrayList();
	
	//부품
	public int searchBox(String sing) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getSing().equals(sing)) {
				return i;
			}
		}
		return -1;
	}
	// 연결 부품
//		int box = searchBox(sing);
//		if(box == -1) return "없습니다";
	
	public String insert(String sing, String singer) { // 마지막에 추가하기
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getSing().equals(sing)) {
				return "중복된 곡입니다";
			}
		}
		list.add(new Member(sing, singer));
		return "추가 성공!";
	}

	public String insert2(String sing, String singer) { // 처음에 추가하기
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getSing().equals(sing)) {
				return "중복된 곡입니다";
			}
		}
		list.add(0,new Member(sing, singer));
		return "추가 성공!";
	}
	public String print() { // 곡 출력
		String a = "";
		for(int i = 0; i<list.size(); i++) {
		a += "곡 명 :"+list.get(i).getSing()+"\n가수 명 :"+list.get(i).getSinger()+"\n";}
		return a;
	}
	public String searchOn(String sing) { //곡 검색하기	
		int box = searchBox(sing);
		if(box == -1) return "없습니다";
		return list.get(box).getSing()+"-"+list.get(box).getSinger()+"을 검색 했습니다.";
	}
	public String remove(String deletesing) { //곡 지우기
		int box = searchBox(deletesing);
		if(box == -1) return "없습니다";
		if(list.get(box).getSing().equals(deletesing)) {
			list.remove(box);
		}
		return "삭제됬습니다";
	}
	
	public String upperData(String searchsing,String sing,String singer) { //곡 업데이트하기
		for(int i = 0; i<list.size()+1; i++) {
			if(i == list.size()) {
				return "없습니다";
			} 
			if(list.get(i).getSing().equals(sing)) {
				return "중복된 곡입니다";
			}
			
			if(list.get(i).getSing().equals(searchsing)) {
				m.setSing(sing);
				m.setSinger(singer);
				list.set(i,new Member(sing,singer));
				break;
			}
		}
		return "없습니다";
	}
	
	public void toLower() {
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(lists -> System.out.println(lists + " "));
	}
	public void toUpper() {
		
	}
	
	
}
