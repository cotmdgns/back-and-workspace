package com.kh.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kh.model.Member;

import config.serverinfo;

public class MemberController {
	
	public boolean signUp(String id,String password,String name) {
		// 회원가입 기능 구현! 
		// -> 아이디가 기존에 있는지 체크 여부!
		// -> member 테이블에 데이터 추가! 
		
		try {
			Class.forName(serverinfo.DRIVER_NAME);
			Connection conn = DriverManager.getConnection(serverinfo.URL,serverinfo.USER,serverinfo.PASSWORD);
			
			String query = "INSERT INTO member(id,password,name) VALUES (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1,id);
			ps.setString(2,password);
			ps.setString(3,name);
			
			if(ps.executeUpdate() == 1) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public String login(String id, String password) {
		try {
			Class.forName(serverinfo.DRIVER_NAME);
			Connection conn = DriverManager.getConnection(serverinfo.URL,serverinfo.USER,serverinfo.PASSWORD);
			
			String query = "SELECT * FROM member WHERE id = ? AND password = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1,id);
			ps.setString(2,password);

			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String Id = rs.getString("id");
				String Password = rs.getString("password");
				if(Id.equals(id) && Password.equals(password)) {
					return rs.getString("name");
				}
			}
			return null;
		} catch (Exception e) {
			return null;
		}
		// 로그인 기능 구현! 
		// -> member 테이블에서 id와 password로 멤버 정보 하나 가져오기!
	}
	
	public void changePassword() {
		// 비밀번호 바꾸기 기능 구현!
		// -> login 메서드 활용 후 사용자 이름이 null이 아니면 member 테이블에서 id로 새로운 패스워드로 변경
		
		
	}
	
	public void changeName() {

		// 이름 바꾸기 기능 구현!
		// -> member 테이블에서 id로 새로운 이름으로 변경 
		
	}
	
}









