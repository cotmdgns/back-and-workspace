package com.kh.Ajax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.Ajax.model.vo.Member;
import com.kh.Ajax.service.MemebrService;

@Controller
public class AjaxMemberController {
	
	@Autowired
	private MemebrService memberservice;
	
	private int count = 0;
	
	@ResponseBody
	@GetMapping("/count")
	public int count() {
		System.out.println("안녕!");
		return ++count;
	}
	
	
	@ResponseBody
	@GetMapping("/encoding")
	public String encoding(String nickname) {
		return nickname;
	}
	
	@ResponseBody
	@PostMapping("/register")
	public boolean register(String idCheck) {
		if(memberservice.idCheck(idCheck) != null || idCheck.trim().isEmpty()) {
			return true;
		}else {
			return false;	
		}
	}
	
	@ResponseBody
	@PostMapping("/serialize")
	public String serialize(Member member) {
		memberservice.register(member);
		return member.getName();
	}
	
	
}
