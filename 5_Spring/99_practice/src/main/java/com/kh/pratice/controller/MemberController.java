package com.kh.pratice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		model.addAttribute("allMember",service.allMember());
		return "index";
	}
	
	@GetMapping("/register")
	public String register() {
		return "mypage/register";
	}
	@PostMapping("/register")
	public String register(Member member) {
		service.register(member);
		return "redirect:/";		
	}
	
	@GetMapping("login")
	public String login() {
		return "mypage/login";
	}
	@PostMapping("login")
	public String login(Member member, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("vo", service.login(member));
		return "redirect:/";
	}
	
	@GetMapping("logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("vo");
		if(member != null) session.invalidate();
		return "redirect:/";
	}
	@PostMapping("update")
	public String updata(Member vo, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("vo");

		if(vo.getId() == null && vo.getName() == null) {
			vo.setId(member.getId());
			vo.setName(member.getName());
		}

		session.setAttribute("vo", vo);
		service.update(vo);
		return "redirect:/";
	}
	
	@GetMapping("delet")
	public String delet(@RequestParam(name="idList" ,required = false) List<String> list) {
		service.delet(list);
		return "redirect:/";
	}
	
	@GetMapping("search")
	public String search(String keyword) {
		System.out.println(keyword);
		return "redirect:/";
	}
	
//	@GetMapping("delet") //@RequestParam 이녀석 자체로 저
//	public String delete(@RequestParam(name="idList",required=false) List<String> idList) {
//		System.out.println(idList);
//		if(idList!=null)service.delet(idList);
//		return "redirect:/";
//	}

}
