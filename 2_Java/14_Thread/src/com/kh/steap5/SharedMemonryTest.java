package com.kh.steap5;

public class SharedMemonryTest {

	public static void main(String[] args) {
		
		// 스레드들은 공유자원을 서로 공유한다
		Calculator cal = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculater(cal);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculater(cal);
		user2.start();
	}

}
