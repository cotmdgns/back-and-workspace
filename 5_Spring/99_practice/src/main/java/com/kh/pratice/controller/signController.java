package com.kh.pratice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.pratice.model.vo.Sign;
import com.kh.pratice.service.MemberService;

@Controller
public class signController {
	
	private MemberService service;
	
	@GetMapping("/myhome")
	public String myhome() {
		return "mypage/myhome";
	}
	
	@PostMapping("sign")
	public String sign(Sign sign) {
		System.out.println("저 왔어요");
		System.out.println(sign);
		System.out.println(sign.getId());
		System.out.println(sign.getPassword());
		System.out.println(sign.getName());
		System.out.println(sign.getEmail());
		System.out.println(sign.getDate());
		System.out.println(sign.getPhone());
		System.out.println(sign.getAddress()); 
		return "redirect:/";
	}
}
