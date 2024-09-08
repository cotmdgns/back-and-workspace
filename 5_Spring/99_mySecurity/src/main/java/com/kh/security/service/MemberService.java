package com.kh.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.kh.security.model.vo.Member;

import mapper.MemberMapper;

@Service
public class MemberService {

	@Autowired
	private MemberMapper mapper;
	
	// 암호화
	private BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder(); // 시큐리티에서 제공하는거라 가져다가 쓰면됨
	
	public void register(Member vo) {
		// DB에 보내기전에 암호화된 비밀번호로 보내기
		vo.setPassword(bcpe.encode(vo.getPassword()));
		vo.setRole("ROLE_ADMIN");
		mapper.register(vo);
	}
	
	public Member login(Member vo) {
//		System.out.println("사용자가 입력한 정보 : " + vo);
		Member member = mapper.login(vo.getId());
//		System.out.println("DB에 있는 사용자 정보 : " + member);
		
		if(member!=null && bcpe.matches(vo.getPassword(), member.getPassword())) {
//			System.err.println("비밀번호 일치한지 체크 : " + bcpe.matches(vo.getPassword(), member.getPassword()));
			return member;
		}
		return null;
	}
}
