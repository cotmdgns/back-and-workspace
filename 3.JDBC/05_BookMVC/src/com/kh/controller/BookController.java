package com.kh.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.model.book;

import config.ServerInfo;

public class BookController {

	// 로그인 이전

	// 드라이브 로딩 및 연결
	public BookController() {
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
	
	public ArrayList<book> printBookAll() {
		
		try {
			Connection conn = Connect();
			String query = "SELECT * FROM book";
			PreparedStatement ps1 = conn.prepareStatement(query);
			
			ResultSet rs = ps1.executeQuery();
			ArrayList<book> list = new ArrayList<>();
			
			while(rs.next()) {
				book b = new book();
				b.setBk_no(rs.getInt("bk_no"));
				b.setBk_title(rs.getString("bk_title"));
				b.setBk_author(rs.getString("bk_author"));
				b.setBk_price(rs.getInt("bk_price"));
				b.setPub_no(rs.getInt("bk_pub_no"));
				list.add(b);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public int registerBook(String title, String auther) {
		try {
			Connection conn = Connect();
			String query = "INSERT INTO book (bk_title,bk_author) VALUES (? , ? )";
			PreparedStatement ps1 = conn.prepareStatement(query);

			ps1.setString(1, title);
			ps1.setString(2, auther);

			int result = ps1.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public int sellBook(int num) {
		try {
			Connection conn = Connect();
			String query = "DELETE  FROM book WHERE bk_no = ?";
			PreparedStatement ps1 = conn.prepareStatement(query);
			ps1.setInt(1, num);
			
			int result = ps1.executeUpdate();
	
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	public int registerMember(String id, String password, String name) {
		try {
			Connection conn = Connect();
			String query = "INSERT INTO member(member_id,member_pwd,member_name) VALUES (?,?,?)";
			PreparedStatement ps1 = conn.prepareStatement(query);
			ps1.setString(1, id);
			ps1.setString(2, password);
			ps1.setString(3, name);
			
			int result = ps1.executeUpdate();
			return result;
		} catch (SQLException e) {
			return 0;
		}
	}
	public String login(String name, String pwd) {
		try {
			Connection conn = Connect();
			String query = "SELCET * FROM member WHERE member_id = ? AND member_pwd = ? ";
			PreparedStatement ps1 = conn.prepareStatement(query);

			int result = ps1.executeUpdate();
			
			return null;
		} catch (SQLException e) {
			return null;
		}
	}
	
	// 로그인 이후
	
	public void rentBook() {
			
	}
	public void printRentBook() {
		
	}
	public void deleteRent() {
		
	}
	public void deleteMember() {
		
	}
}
