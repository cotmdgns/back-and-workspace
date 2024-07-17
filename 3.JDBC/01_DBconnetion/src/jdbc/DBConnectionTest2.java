package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnectionTest2 {
	
	// mySQL이 아니라 오라클 등등 다른걸로 바뀔수도 있으니 변수로 저장
	public static final String DRIVER_NAME ="com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/kh";
	public static final String USER = "root";
	public static final String PASSWORD = "qwer1234";
	
	public static void main(String[] args) {

		try {
			// 1. 드라이버 로딩
			Class.forName(DRIVER_NAME);
			// 2. 데이터베이스 연결
			Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
			
			// 3. PreparedStatement - INSERT // 추가하기
			String query = "INSERT INTO employee(emp_id,emp_name,emp_no) VALUES (?, ?, ?)"; //우리가 직접입력이 아니라 받아야할곳이라 ?로
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setInt(1, 900); // 1번째 물음표
			ps.setString(2, "채승훈"); //2번째
			ps.setString(3, "970109-1111111");//3번째
			
			// 4. 퀴리문 실행
			System.out.println(ps.executeUpdate() + "명 추가!"); // executeUpdate() 반환값이 int , 엽데이트
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
