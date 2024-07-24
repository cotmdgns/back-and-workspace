package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	public Connection Connect() throws SQLException {
		return DriverManager.getConnection
		(ServerInfo.URL,ServerInfo.USER,ServerInfo.PASSWORD);
	}

	
	// 자원 반납
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		ps.close();
		conn.close();
	}
	public void closeAll(ResultSet rs,PreparedStatement ps, Connection conn) throws SQLException {
		rs.close();
		closeAll(ps,conn);
	}
	
	//4. 회원가입
	public void registerMember(String id, String password, String name) throws SQLException {
		Connection conn = Connect();
		String qeury = "INSERT INTO member(member_id, member_pwd, member_name) VALUES (?,?,?)";
		PreparedStatement ps = conn.prepareStatement(qeury);
		ps.setString(1, id);
		ps.setString(2, password);
		ps.setString(3, name);
		ps.executeUpdate();
		closeAll(ps,conn);
	}
	
	// 로그인
	public Member login(String id, String password) throws SQLException {
		Connection conn = Connect();
		String query = "SELECT * FROM member WHERE member_id = ? AND member_pwd =?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, id);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		Member member = new Member();
		if(rs.next()) {
			member.setMemberId(id);
			member.setMenberPwd(password);
			member.setMemberName(rs.getString("member_name"));
			member.setMemberNo(rs.getInt("member_no"));
			member.setStatus(rs.getString("status").charAt(0));
		}
		closeAll(rs,ps,conn);
		return member;
	}
	
	// 5. 회원탈퇴
	public int deleteMember(int memberNo) throws SQLException {
		Connection conn = Connect();
		String query = "DELETE FROM member WHERE member_no = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, memberNo);
		int result = ps.executeUpdate();
		closeAll(ps, conn);
		return result;
	}

}
