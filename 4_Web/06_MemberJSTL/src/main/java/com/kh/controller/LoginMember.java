package com.kh.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

@WebServlet("/login")
public class LoginMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("password");
		
		MemberDAO mdao = new MemberDAO();
		try {
			Member member = mdao.login(id, pwd);
			
			// 바인딩 Session
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			
			response.sendRedirect("/index.jsp");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 내가 한거
//		Boolean check = false;
//		try {
//			check = mdao.loginMember(id, pwd);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		HttpSession session = request.getSession();
//		session.setAttribute("check", check);
//		response.sendRedirect("/index.jsp");
	}
}
