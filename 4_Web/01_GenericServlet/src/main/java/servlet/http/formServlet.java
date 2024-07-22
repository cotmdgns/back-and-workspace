package servlet.http;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/form")
public class formServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String name = request.getParameter("userId");
		String password = request.getParameter("userPwd");
		String gender = request.getParameter("gender").charAt(0)=='M' ? "남자" : "여자";
		String[] menu = request.getParameterValues("menu");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1> 정보를 출력합니다 .. </h1><br>");
		out.println("<div> 당신의 아이디는 : "+name+"</div><br>");
		out.println("<div> 당신의 비밀번호는 : "+password+"</div><br>");
		out.println("<div> 당신의 성별은 : "+gender+" </div><br>");
		out.println("<ul>");
		if(menu !=null) {
			for(int i =0;i<menu.length;i++) {
				out.println("<li>"+menu[i]+"</li>");
			}
			out.println("</ul>");
			out.println("</body></html>");
		}
	}

}
