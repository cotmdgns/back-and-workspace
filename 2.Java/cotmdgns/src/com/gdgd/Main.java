package com.gdgd;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt();
		
		if(a > 0 && b > 0) {
			System.out.println(1);
		}else if(a < 0 && b > 0) {
			System.out.println(2);
		}else if(a < 0 && b < 0) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
		
<<<<<<< Updated upstream
=======
		if(a % 4 == 0 && a % 100 != 0 || a % 4 == 0 && a % 400 == 0) {
			System.out.println("1");
		}else{
			System.out.println("0");
		}
>>>>>>> Stashed changes
	}
}
