package com.gdgd;

import java.util.Scanner;
public class aasddsdw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(100 >= a && a >= 90) {
			System.out.println("A");
		}else if(90 > a && a >= 80) {
			System.out.println("B");
		}else if(80 > a && a >= 70) {
			System.out.println("C");
		}else if(70 > a && a >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
