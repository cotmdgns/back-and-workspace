package com.kh.pratice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.pratice.model.vo.Member;
import com.kh.pratice.service.MemberService;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("allmember",service.allmember());
		return "index";
	}
	
	@GetMapping("/register")
	public String register() {
		return "mypage/register";
	}
	
	@PostMapping("/register")
	public String register(Member vo) {
		service.register(vo);
		return "redirect:/";
	}
	
	@GetMapping("/login")
	public String login() {
		return "mypage/login";
	}
	
	@PostMapping("/login")
	public String login(Member vo, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("vo", service.login(vo));
		return "redirect:/";
	}
	
	
}
