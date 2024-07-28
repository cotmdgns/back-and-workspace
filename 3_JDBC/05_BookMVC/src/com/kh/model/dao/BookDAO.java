package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.model.vo.Book;
import com.kh.model.vo.Publisher;

import config.ServerInfo;

/*
 * DAO (Data Access Object)
 * - DB에 접근하는 역활을 하는 객체(CRUD)
 * 
 * */

public class BookDAO {
	
	public BookDAO() {
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
	
	
	// 1. 전체 책 조회
	public ArrayList<Book> printBookAll() throws SQLException{
		Connection conn = connect();
		String query = "SELECT * FROM book LEFT join publisher ON (bk_pub_no = pub_no); ";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ResultSet rs = ps.executeQuery();
		ArrayList<Book> list = new ArrayList<>();
		
		while(rs.next()) {
			Book book = new Book();
			book.setBkNo(rs.getInt("bk_no"));
			book.setBkTitle(rs.getString("bk_title"));
			book.setBkAuthor(rs.getString("bk_author"));
			
			Publisher publisher = new Publisher();
			publisher.setPubName(rs.getString("pub_name"));
			book.setPublisher(publisher);
			
			list.add(book);
		}
		
		closeAll(rs,ps,conn);
		return list;
	}
	
	// 책 확인 여부 (title,author)
	public boolean checkBook(String title, String author) throws SQLException {
		Connection conn = connect();
		String query = "SELECT * FROM book WHERE bk_title = ? AND bk_author = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setString(1, title);
		ps.setString(2, author);
		
		ResultSet rs = ps.executeQuery();
		boolean check = rs.next();
		
		closeAll(rs,ps,conn);
		return check;
	}
	

	// 2. 책 동록
	public void registerBook(String title,String author) throws SQLException{
		Connection conn = connect();
		String query = "INSERT INTO book(bk_title, bk_author) VALUES (?,?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, title);
		ps.setString(2, author);
		ps.executeUpdate();
		
		closeAll(ps,conn);
	}
	
	// 3. 책 삭제
	public void sellBook(int no) throws SQLException {
		Connection conn = connect();
		
		String query = "DELETE FROM book WHERE bk_no = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, no);
		
		ps.executeUpdate();
		closeAll(ps,conn);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
