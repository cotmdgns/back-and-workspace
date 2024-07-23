package com.kh.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/view")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. DAO - showAllMember
		MemberDAO mdao = new MemberDAO();
		ArrayList<Member> mem = null;
		try {
			mem = mdao.printAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2. 바인딩 : list 전체
		request.setAttribute("mem", mem);
		
		// 3. 네이게이턴 : view.jsp
		request.getRequestDispatcher("view.jsp").forward(request, response);
		
	}

}
