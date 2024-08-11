package com.kh.Ajax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.Ajax.model.vo.Member;

import mapper.MemberMapper;

@Service
public class MemebrService {

	@Autowired
	private MemberMapper mapper;
	
	public String idCheck(String idCheck) {
		return mapper.idCheck(idCheck);
	}
	public void register(Member member) {
		mapper.register(member);
	}
}
