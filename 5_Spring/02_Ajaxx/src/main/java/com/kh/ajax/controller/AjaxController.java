package com.kh.ajax.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.ajax.model.vo.Member;
import com.kh.ajax.service.MemberService;

@Controller
public class AjaxController {
	
	@Autowired
	private MemberService service;
	
	private int count = 0; 
	
	@ResponseBody
	@GetMapping("/count") // 어노테션 두개 써야함
	public int count() {
		System.out.println("ajax로 요청이 들어옴!");
		return ++count;
	}
	
	@ResponseBody
	@GetMapping("/encoding")
	public String encoding(String nickname) { // 키값보낸거 똑같이
		return nickname;
	}
	
	@ResponseBody
	@PostMapping("/check")
	public boolean checkid(String id) {
		Member memebr = service.idCheck(id);
		if(memebr != null || id.trim().isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	@ResponseBody
	@PostMapping("/serial")
	public Member register(Member member) {
		service.register(member);
		return member;
	}
}
