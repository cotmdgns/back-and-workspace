package com.kh.controller;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.kh.model.Member;

import config.serverinfo;

public class MemberController {

	Properties p = new Properties();
	
	// 싱글톤 패턴 (Singleton Pattern)
	// - 디자인 패턴 중 하나로 클래스가 최대 한 번 객체 생성되도록 하는 패턴
	
	// 1. 생성자는 private
	private MemberController() {
		try {
			p.load(new FileInputStream("src/config/jdbc.properties"));
			// (1) 드라이버 로딩
			Class.forName(serverinfo.DRIVER_NAME);
			// (2) 드라이버 연결
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 2. 유일한 객체를 담을 static 변수
	private static MemberController instance;
	
	// 3. 객체를 반환하는 static 메서드
	public static MemberController getInstance() {
		if(instance == null) 
			instance = new MemberController();
		return instance;
	}

	
	// 개발하기전에 공통적인 부분을 세팅 해놔야 편하다
	public Connection connect() throws SQLException {
		return DriverManager.getConnection
		(serverinfo.URL,serverinfo.USER,serverinfo.PASSWORD);
	}
	public void close(PreparedStatement ps,Connection conn) throws SQLException {
		ps.close();
		conn.close();
	}
	public void close(ResultSet rs, PreparedStatement ps,Connection conn) throws SQLException {
		rs.close();
		close(ps, conn);
	}
	
	public boolean idCheck(String id) throws SQLException {
		Connection conn = connect();
		PreparedStatement ps = conn.prepareStatement(p.getProperty("idCheck"));
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		String checkId = null;
		if(rs.next()) checkId = rs.getString("id");
		close(rs,ps,conn);
		if(checkId != null) return true;
		return false;
	}
	
	public boolean signUp(Member m) throws SQLException {
		// 회원가입 기능 구현! 
		// -> 아이디가 기존에 있는지 체크 여부!
		// 쓰로누 (넘기는 ) 방식
		if(!idCheck(m.getId())) {
			// -> member 테이블에 데이터 추가!
			Connection conn = connect();
			PreparedStatement ps = conn.prepareStatement(p.getProperty("signUp"));
			ps.setString(1, m.getId());
			ps.setString(2, m.getPassword());
			ps.setString(3, m.getName());
			
			ps.executeUpdate();
			close(ps,conn);
			return true;
		}
		return false;
	
		//트라이 켓치 방법
//		try {
//			Connection conn = connect();
//			PreparedStatement ps = conn.prepareStatement(p.getProperty("signUp"));
//			ps.setString(1, m.getId());
//			ps.setString(2, m.getPassword());
//			ps.setString(3, m.getName());
//			
//			ps.executeUpdate();
//			close(ps,conn);
//			return true;
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return false;
		
		
		

//		try {
//			Class.forName(serverinfo.DRIVER_NAME); //로딩
//			Connection conn = DriverManager.getConnection(serverinfo.URL,serverinfo.USER,serverinfo.PASSWORD); //연결
//			
//			String query = "INSERT INTO member(id,password,name) VALUES (?,?,?)";
//			PreparedStatement ps = conn.prepareStatement(query); // 연결한걸 실행 시킨다 뭐를 쿼리변수를
//			ps.setString(1,id);
//			ps.setString(2,password);
//			ps.setString(3,name);
//			
//			if(ps.executeUpdate() == 1) { //ps.executeUpdate() 리턴값은 1
//				return true;
//			}else {
//				return false;
//			}
//		} catch (Exception e) {
//			return false;
//		}
		
	}

	public String login(String id, String password) throws SQLException {
		
		// 로그인 기능 구현!
		// -> member 테이블에서 id와 password로 멤버 정보 하나 가져오기!
		Connection conn = connect();
		PreparedStatement ps = conn.prepareStatement(p.getProperty("login"));
		ps.setString(1, id);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		String name = null;
		
		if(rs.next()) name = rs.getString("name");
		close(rs,ps,conn);		
		return name;
	}
	
	
	public boolean changePassword(String id ,String oldPw ,String newPw) throws SQLException {
		// 비밀번호 바꾸기 기능 구현!
		// -> login 메서드 활용 후 사용자 이름이 null이 아니면 
		//	  member 테이블에서 id로 새로운 패스워드로 변경

		
		if(login(id,oldPw)!=null) {
			Connection conn = connect();
			PreparedStatement ps = conn.prepareStatement(p.getProperty("changePassword"));
			ps.setString(1, newPw);
			ps.setString(2, id);
			ps.executeUpdate();
			close(ps,conn);
			return true;
		}
		return false;
		
	}
	

	public void changeName(String id, String newName) throws SQLException {

		// 이름 바꾸기 기능 구현!
		// -> member 테이블에서 id로 새로운 이름으로 변경 
		
		Connection conn = connect();
		PreparedStatement ps = conn.prepareStatement(p.getProperty("changeName"));
		ps.setString(1, newName);
		ps.setString(2, id);
		ps.executeUpdate();
		close(ps,conn);

	}
	
}









