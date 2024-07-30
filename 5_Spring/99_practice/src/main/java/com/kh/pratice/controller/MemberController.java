package com.kh.pratice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.pratice.model.vo.Member;
import com.kh.pratice.service.MemberService;

@Controller
public class MemberController {
	
	private MemberService service;
	
	public MemberController(MemberService service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/register")
	public void register() {}
	
	@PostMapping("/register")
	public String register(Member vo) {
		service.register(vo);
		 return "redirect:/";
	}
}
