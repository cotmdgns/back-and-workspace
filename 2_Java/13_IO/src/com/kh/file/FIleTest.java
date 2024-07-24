package com.kh.file;

import java.io.File;
import java.io.IOException;

/*
 * File 클래스
 * - 파일과 디렉터리를 다르는데 사용되는 클래스
 * */

public class FIleTest {
	
	public static void main(String[] args) {
		File file = new File("src/test.txt");
		
		System.out.println("파일명 : " + file.getName()); // 파일 이름 가져오기
		System.out.println("절대 경로 : " + file.getAbsolutePath()); // 절대 경로 찾기
		System.out.println("상대 경로 : " + file.getPath()); // 상대 경로 찾기
		System.out.println("파일 용량 : " + file.length()); // 파일 용량
		System.out.println("파일 존재 여부 : " + file.exists()); // 파일 존재 여부
		System.out.println("디렉터리 여부 : " + file.isDirectory()); // 디렉터리 여부
		
		// 만약 존재하지 않는 경로를 제시하면 IOException 발생
		File newFile = new File("src/temp/test.txt"); 
		try {
			// 존재하지않는 포더부터 만든다.
			File tempDir = new File("src/temp");
			if(!tempDir.isDirectory()) { //폴더가 존재하지않을경우
				tempDir.mkdir(); // 폴더를 만든다.
			}
			if(!newFile.exists()) { // 파일이 존재하지 않을경우
				newFile.createNewFile()	;//파일을 만든다.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
