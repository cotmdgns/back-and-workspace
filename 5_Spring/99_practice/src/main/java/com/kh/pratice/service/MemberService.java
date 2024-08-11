package com.kh.pratice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.pratice.model.vo.Member;

import mapper.MemberMapper;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper membermapper;
	
	public List<Member> allMember(){
		return membermapper.allMember();
	}
	public void register(Member member) {
		membermapper.register(member);
	}
	public Member login(Member member) {
		return membermapper.login(member);
	}
	public void update(Member member) {
		membermapper.update(member);
	}
	public void delet(List<String> idList) {
		membermapper.delet(idList);
	}
}
