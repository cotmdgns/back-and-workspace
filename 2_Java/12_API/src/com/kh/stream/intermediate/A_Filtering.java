package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.kh.stream.model.Student;

/*
 * 필터링
 * - 중간 처리 기능으로 요소를 걸러내는 역활
 * 
 * */

public class A_Filtering {

	// distinct : 중복 제거
	public void method1() {
		
		List<String> names = Arrays.asList("김현호", "우현성", "김경주", "주준영", "조창현",
											   "김진주", "우현성", "김경주", "주준영");
		Stream<String> stream =names.stream();
		stream
			.distinct()
			.forEach(name -> System.out.print(name + " "));
		
		List<Student> students = Arrays.asList(
									new Student("김현호", 20,"남자",80,50),
									new Student("우현성", 19,"남자",75,60),
									new Student("김경주", 18,"여자",50,100),
									new Student("주준영", 21,"남자",60,45),
									new Student("조창현", 19,"남자",70,97),
									new Student("김진주", 22,"여자",80,50),
									new Student("주준영", 21,"남자",60,45),
									new Student("조창현", 19,"남자",70,97));
		students.stream()
			.distinct()
			.forEach(student -> System.out.println(student));
		
	}
	// filter : 조건문 사용한다라고 보시며 됨
	public void method2() {
		List<String> names = Arrays.asList("김현호", "우현성", "김경주", "주준영", "조창현","김진주");
		
		names.stream()
			.filter(name -> name.startsWith("김"))
			.forEach(name -> System.out.print(name + " "));
		
		List<Student> students = Arrays.asList(
				new Student("김현호", 20,"남자",80,50),
				new Student("우현성", 19,"남자",75,60),
				new Student("김경주", 18,"여자",50,100),
				new Student("주준영", 21,"남자",60,45),
				new Student("조창현", 19,"남자",70,97),
				new Student("김진주", 22,"여자",80,50));
		System.out.println();
		// 성별이 여자인 요소만 출력
		students.stream()
			.filter(name -> name.getGenderr().equals("여자"))
			.forEach(name -> System.out.println(name));
		// 수학 점수, 영어 점수 둘다 60점 이상인 요소만 출력
		students.stream()
			.filter(name -> name.getMeth() >= 60 && name.getEnglish() >= 60)
			.forEach(name -> System.out.println(name));
	}
	
	public static void main(String[] args) {
		A_Filtering a = new A_Filtering();
//		a.method1();
		a.method2();
	}

}
