package com.kh.pratice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.pratice.model.vo.Member;

import mapper.MemberMapper;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper Mapper;
			
	public void register(Member member) {
		Mapper.register(member);
	}
	
	public List<Member> allmember() {
		return Mapper.allmember();
	}
	
	public Member login(Member member) {
		return Mapper.login(member);
	}
	 
}
