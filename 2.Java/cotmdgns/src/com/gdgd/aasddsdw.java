package com.gdgd;

import java.util.Scanner;

public class aasddsdw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		
		System.out.println(A*((B%100)%10)); // 3번째 자리
		System.out.println((A * ((B/10)%10))*10); // 4번째 자리
		System.out.println((A * (B/100))*100); // 5번째 자리
		
	}
}
