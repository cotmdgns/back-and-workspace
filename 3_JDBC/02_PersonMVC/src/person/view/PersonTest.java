package person.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import config.ServerInfo;
import person.controller.PersonController;
import person.model.Person;

public class PersonTest {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	public static void main(String[] args) {
		PersonTest pt = new PersonTest();
		// 이 부분은 테스트 용도로만!
		//person 테이블에 데이터 추가
		//pt.addPerson("채승훈", 27, "서울");
		try {
			// 이 부분은 테스트 용도로만!
			//person 테이블에 데이터 추가
//			pt.addPerson("채승훈", 27, "서울");
//			pt.addPerson("채승훈", 2, "광주");
//			pt.addPerson("채승훈" ,2 , "안녕");
//			pt.updataPerson(new Person(1, "김진주",8,"광주"));
//			pt.removePerson(1);
//			pt.searchAllPerson();
			pt.searchPerson(2);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	// 각 Controller 에 메서드들 연결하는 건 각 메서드들에서 구현
	public void addPerson(String name, int age, String adde) throws SQLException {
		int result = pc.addPerson(name, age, adde);
		if(result == 1) {
			System.out.println(name + ",님 회원가입 완료!");
		}
	}
	// person 테이블에 테이터 수정 - UPDATE
	public void updataPerson(Person person) throws SQLException {
		String name = pc.updataPerson(person);
		if(name!=null) {
			System.out.println(name + "님, 정보수정 완료!");
		}
	}
	// person 테이블에 테이터 삭제 - DELETE
	public void removePerson(int id) throws SQLException {
		String name = pc.removePerson(id);
		if(name!=null) {
			System.out.println(name + "님, 회원탈퇴 완료!");
		}
	}	
	// person 테이블에 있는 테이터 전체 보여주기 - SELECT
	public void searchAllPerson() throws SQLException {
		ArrayList<Person> list = pc.searchAllPerson();
		for(Person p : list) {
			System.out.println(p);
		}
	}	
	// person 테이블에 데이터 한개만 가져오기 - SELECT
	public void searchPerson(int id) throws SQLException {
		Person p = pc.searchPerson(id);
		System.out.println(p);
	}	
	

}

	