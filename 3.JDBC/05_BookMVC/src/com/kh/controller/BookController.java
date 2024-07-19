package com.kh.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.model.vo.Book;
import com.kh.model.vo.Member;
import com.kh.model.dao.BookDAO;
import com.kh.model.dao.RentDAO;

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

	// 1. 전체 책 조회
	private BookDAO book = new BookDAO();
	private RentDAO rent = new RentDAO();
	
	public ArrayList<Book> printBookAll(){
		//BAO 에서 넘기면 컨트롤에서 잡아줘야함 (넘기지말고)
		try {
			return book.printBookAll();
		} catch (SQLException e) {
			return null;
		}
	}
	
	// 2. 책 등록
	public boolean registerBook(String title,String author) {
		//BAO 에서 넘기면 컨트롤에서 잡아줘야함 (넘기지말고)
		try {
			// 기존 제목, 저자 있으면 등록 안되게!
			if(!book.checkBook(title, author)) {
				book.registerBook(title, author);
				return true;
			}
		} catch (SQLException e) {}
		return false;
	}
	
	// 3. 책 삭제
	public boolean sellBook(int no) {

		try {
			// 빌려있는 책 삭제 못하게!
			if(rent.checkRentBook(no)) {
				return false;
			}
			// 없는 번호 삭제하려고 하면 실패가 떠야지 정상
			// --> 기존 책들 중에 해당 no가 없는 경우!
			// --> 기존 책들 중에 해당 no가 있는 경우만 삭제
			for(Book b : book.printBookAll()){
				if(b.getBkNo() == no) {
					book.sellBook(no);
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	
		
		
	
	
	// 로그인 이후
	public void rentBook() {
		
		
		
	}
	public void printRentBook() {
		
	}
	public void deleteRent() {
		
	}
	public int deleteMember(String id, String pwd) {
		try {
			Connection conn = Connect();
			String query = "DELECT FROM member WHERE member_id = ? AND WHERE member_pwd =?";
			PreparedStatement ps1 = conn.prepareStatement(query);
			ps1.setString(1, id);
			ps1.setString(1, pwd);
			int result = ps1.executeUpdate();
			if(result == 1) {
				return result;
			}else {
				return 0;
			}
		} catch (SQLException e) {
			return 0;
		}
	}
}
