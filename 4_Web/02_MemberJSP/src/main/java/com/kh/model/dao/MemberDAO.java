package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.model.vo.Member;

import config.ServerInfo;


public class MemberDAO {
	
	public MemberDAO() {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Connection connect() throws SQLException {
		return DriverManager.getConnection
				(ServerInfo.URL,ServerInfo.USER,ServerInfo.PASSWORD);
	}
	
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		ps.close();
		conn.close();
	}
	public void closeAll(ResultSet rs,PreparedStatement ps, Connection conn) throws SQLException {
		rs.close();
		closeAll(ps,conn);
	}
	
	//회원가입
	public void registerMember(String id,String pwd,String name) throws SQLException {
		Connection conn = connect();
		
		String query = "INSERT INTO member VALUES (?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setString(1, id);
		ps.setString(2, pwd);
		ps.setString(3, name);
		ps.executeUpdate();
		closeAll(ps, conn);
		
		
	}
	
	//전체 회원 보기 - printAll()
	public ArrayList<Member> printAll() throws SQLException {
		Connection conn = connect();
		
		String query = "SELECT * FROM member";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ResultSet rs = ps.executeQuery();
		ArrayList<Member> list = new ArrayList<>();
		
		while(rs.next()) {
			Member member = new Member();
			member.setId(rs.getString("id"));
			member.setPassword(rs.getString("password"));
			member.setName(rs.getString("name"));
			
			list.add(member);
		}
		closeAll(rs, ps, conn);
		return list;
	}
	
	public Member searchMember(String id) throws SQLException {
		Connection conn = connect();
		
		String query = "SELECT * FROM member WHERE id = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		
		Member mem = null;
		if(rs.next()) {
			mem = new Member(id,rs.getString("password"),rs.getString("name"));
		}
		closeAll(rs, ps, conn);
		return mem;
	}
}
