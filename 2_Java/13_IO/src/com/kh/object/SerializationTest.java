package com.kh.object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import com.kh.object.model.Person;

public class SerializationTest {
	
	String fileName = "src/person.obj";
	
	public static void main(String[] args) {
		SerializationTest s = new SerializationTest();
//		s.fileSave();
//		s.fileRead();
		s.ObjectsSave();
		s.objectRead();
	}
	
	// 직렬화(Serialization) : 객체를 데이터 스르팀으로 만드는 것
	public void fileSave() {
		// 1.스트림 생성
		// FileOutputStream		: 파일 출력에 사용되는 기본 바이트 스트림 클래
		// ObjectOutputStream	: 객체 단위로 출력 시에 사용되는 보조 바이트 스트림 클래스
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				){
			
			// 2. 파일에 저장할 객체 생성
			Person p = new Person("셀레너 고메즈", "selenagomez");
			
			// 3. 파일에 데이터(객체) 저장
			oos.writeObject(p);
			
			System.out.println("Person.obj 파일에 정보 저장!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// 역직렬화(deserialization) : 저정된 내용이나 전송받은 내용을 다시 복원하는 것
	public void fileRead() {
		// 1. 스트림 생성
		// FileInputStream : 파일 출력에 사용되는 기본 바이트 스트림 클래스
		// ObjectInputStream : 객체 단위로 출력 시에 사용되는 보조 바이트 스트림 클래스
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
			// 2. 보조 스트림에 담겨진 객체 가져오기
			Person p = (Person) ois.readObject();
			System.out.println(p);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 여러 객체 저장(for문 이용) -> 위에 filsSave 참고
	public void ObjectsSave() {
		List<Person> list = Arrays.asList(
				new Person("카일리 제너", "kyliejener"),
				new Person("드웨인 존슨", "therock"),
				new Person("아리아나 그란데", "arianagrande"),
				new Person("킴 카다시안", "kimkardashian"),
				new Person("비욘세", "beyonce")
				);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			for(Person p : list) {
//				oos.writeObject(p.getName()); // 이게 이름만 가져오기
				oos.writeObject(p);
			}	
		} catch (Exception e) {

		}
		// 내가 한거
//		try (FileOutputStream fos = new FileOutputStream(fileName,false);
//				ObjectOutputStream oos = new ObjectOutputStream(fos);){
//			for(int i =0;i<list.size();i++) {
//				oos.writeObject(list);
//			}
//		} catch (Exception e) {
	}
	//파일에 저장된 데이터 읽기 (반복문 사용) -> 위에 fileRead 참고
	public void objectRead() {
		
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
			//벙법 1
//			for(int i =0; i<fileName.length();i++) {
//				System.out.println(ois.readObject());
//			}
			//벙법 2			
//			List<Person> p = (List<Person>) ois.readObject();
//			for(Person pp : p) {
//				System.out.println(pp);
//			}
			//벙법 3
			while(true) {
				System.out.println(ois.readObject());
			}
		} catch (Exception e) {

		}
//		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));){
//			
//			List<Person> p = (List<Person>) ois.readObject();
//			for(Person pp : p) {
//				System.out.println(pp);
//			}
//		} catch (Exception e) {
//			
//		}
	}
}
