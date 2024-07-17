package person.controller;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import config.ServerInfo;
import person.model.Person;

public class PersonController {
	
	// 리턴 타입이나 매개변수(파라미터) 자유롭게 변경 가능!
	// 메서드 추가 가능! <-- 추천!!
	/*
	 * 1. 드라이버 로딩
	 * 2. DB 연결
	 * 3. PreparedStatement
	 * 4. 쿼리 실행 
	 * */
	
	public PersonController() {
		//1. 드라이버 로딩
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 고정적인 반복 -- DB 연결, 자원 반납 -> 공통적인 메서드 정의 ... 메서드마다 호출해서 사용!
	public Connection getConnect() throws SQLException {
	//2. DB 연결
		return DriverManager.getConnection
				(ServerInfo.URL,ServerInfo.USER,ServerInfo.PASSWORD);
	}
	// 5. 자원 반납
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		ps.close();
		conn.close();
	}
	public void closeAll(ResultSet rs,PreparedStatement ps, Connection conn) throws SQLException {
		rs.close();
		closeAll(ps,conn);
	}
	
	// 변동적인 반복 -- 비즈니스 로직 DAO (Database Access Object)
	//person 테이블에 테이터 추가 - INSERT
	public int addPerson(String name, int age, String adde) throws SQLException {
		// 3. PreparedStatement
		Connection conn = getConnect();

		String query = "INSERT INTO person(name,age,adde) VALUES (?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(query); 
		ps.setString(1, name);
		ps.setInt(2, age);
		ps.setString(3, adde);
		
		// 4. 쿼리 실행 
		int result = ps.executeUpdate();
		
		// 5. 자원 반납
		closeAll(ps,conn);
		
		return result;
	}
	// person 테이블에 테이터 수정 - UPDATE
	public String updataPerson(Person person) throws SQLException {
		Connection conn = getConnect();
		
		String query = "UPDATE person SET name =?, age =?, adde =? WHERE id =?";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setString(1, person.getName());
		ps.setInt(2, person.getAge());
		ps.setString(3, person.getAddr());
		ps.setInt(4, person.getId());
		
		String name = null;
		if(ps.executeUpdate() == 1) {
			name = person.getName();
		};
		closeAll(ps,conn);
		
		return name;
	}
	// person 테이블에 테이터 삭제 - DELETE
	public String removePerson(int id) throws SQLException {
		
		Connection conn = getConnect();
		Person person = searchPerson(id);
		String name = null;
		String query = "DELETE FROM person WHERE id = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, id);
		if(ps.executeUpdate() == 1) {
			name = person.getName();
		}
		closeAll(ps,conn);
		return name;
		
	}	
	// person 테이블에 있는 테이터 전체 보여주기 - SELECT
	public ArrayList<Person> searchAllPerson() throws SQLException {
		Connection conn = getConnect();
		
		String query = "SELECT * FROM person";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ResultSet rs = ps.executeQuery();
		ArrayList<Person> list = new ArrayList<>();
		
		while(rs.next()) {
			Person person = new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setAge(rs.getInt("age"));
			person.setAddr(rs.getString("adde"));
			list.add(person);
		}
		
		return list;
		
	}	
	// person 테이블에 데이터 한개만 가져오기 - SELECT
	public Person searchPerson(int id) throws SQLException {
		Connection conn = getConnect();
		
		String query = "SELECT * FROM person WHERE id = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setInt(1, id);
		
		ResultSet rs =ps.executeQuery();
		
		Person person = null;
		
		if(rs.next()) {
			person = new Person(rs.getInt("id"),
								rs.getString("name"),
								rs.getInt("age"),
								rs.getString("adde"));
		}
		
		closeAll(rs,ps,conn);
		return person;
		
	}	
}







