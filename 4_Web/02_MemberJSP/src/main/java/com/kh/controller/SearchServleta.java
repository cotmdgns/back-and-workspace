package com.kh.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

/**
 * Servlet implementation class SearchServleta
 */
@WebServlet("/search")
public class SearchServleta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 폼 값 받는다
		String id = request.getParameter("id");
		
		// 2. DAO
		MemberDAO dao = new MemberDAO();
		
		Member mem = null;
		try {
			mem = dao.searchMember(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 3. 바인딩
		request.setAttribute("info", mem);
		//					키: 아무거나 입력 상관없임 (내가 여기에 저장했다.)
		
		//4. 네비게이션
		request.getRequestDispatcher("search.jsp").forward(request, response);
	}

}
