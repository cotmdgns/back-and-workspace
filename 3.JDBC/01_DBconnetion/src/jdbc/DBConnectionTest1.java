package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class DBConnectionTest1 {

	public static void main(String[] args) {

		// JDBC (Java Database Connectivity) 작업 4단계
		// 파일을 넣어줘야 실행 가능
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 로딩...!");
			
			// 2. 데이터베이스와 연결
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/kh","root","qwer1234");
			// 연결      변수                 얻다 연결
			System.out.println("2. 데이터베이스와 연결...!");
			
			// 3. Statement 객체 생성 - 쿼리 : SELECT
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM employee"); // 리턴타입이 PreparedStatement
			//준비됨    성명				 준비하다   성명
			// 4. 쿼리문 실행
			ResultSet rs = ps.executeQuery(); // ps.executeQuery() 리턴타입이 ResultSet 
			//결과 세트 		   실행하다  퀴리
			//rs.next : 다음줄이 있냐 없으면 나감 (무한루프가 안걸림)
			while(rs.next()) {
				String empId = rs.getString("emp_id"); //mysql에 empId는 Varchar,char 문자열이기때문에 String
				String empName = rs.getString("emp_name");
				int salary = rs.getInt("salary");
				float bonus = rs.getFloat("bonus");
				Date hireDate = rs.getDate("hire_date");
				char entYn = rs.getString("ent_yn").charAt(0);
				
				System.out.println(empId + " / " + empName + " / " + 
									salary + " / " + bonus + " / " + 
									hireDate + " / " + entYn);
			}
					
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}	

}
