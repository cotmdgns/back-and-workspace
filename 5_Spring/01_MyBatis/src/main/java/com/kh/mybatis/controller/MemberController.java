package com.kh.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.mybatis.model.dto.SearchDTO;
import com.kh.mybatis.model.vo.Member;
import com.kh.mybatis.service.MemberService;
import com.mysql.cj.Session;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
//	public MemberController(MemberService service) {
//		this.service = service;
//	}
	
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
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Member member = (Member)session.getAttribute("vo");
		if(member != null) session.invalidate(); // 세션 무효화? 정지? 지우기?
		return "redirect:/";
	}
	
	@PostMapping("/update")
	public String update(Member vo, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("vo");
		
		// 기본적으로 넘어가는데 비밀번호가 왔을땐 if 에 걸림
		if(vo.getId()==null) vo.setId(member.getId());
		System.out.println(vo);
		if(vo.getName()==null) vo.setName(member.getName());
		
		service.update(vo);
		// 업데이트후 계정정보 클라이언트에 남기기
		session.setAttribute("vo", vo);
		
		return "redirect:/";
	}

	@GetMapping("/search")
	public String serarch(SearchDTO dto, Model model) {
		model.addAttribute("search",service.search(dto));
		return "index";
	}
	
	@PostMapping("/delete") //@RequestParam 이녀석 자체로 저
	public String delete(@RequestParam(name="idList",required=false) List<String> idList) {
		if(idList!=null)service.delete(idList);
		return "redirect:/";
	}
	
	
	
	
	
	
	
	
	
	
	
}
