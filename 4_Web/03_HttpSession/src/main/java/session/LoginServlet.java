package session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 폼 값 받는다.
		String id = request.getParameter("id");
		String pwd = request.getParameter("password");
		
		// DAO 생략.. 로그인 성공했다 가정!
		
		Member member = new Member(id,password,"테스트");
	}

}