package com.kh.controller.component;

import com.kh.controller.Controller;
import com.kh.controller.ModelAndView;
import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * 컴포넌트
 * - 인터페이스 기반으로 작성된 재사용이 강한 자바 클래스
 * */	
public class RegisterContorller implements Controller{

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String pwd = request.getParameter("password");
		String name = request.getParameter("name");
		
		MemberDAO dao = new MemberDAO();
		dao.register(new Member(id,pwd,name));
		
		return new ModelAndView("index.jsp",true);
	}
}
