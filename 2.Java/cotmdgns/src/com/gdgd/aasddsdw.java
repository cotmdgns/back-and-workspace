package com.gdgd;

import java.util.Scanner;
public class aasddsdw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());

		int sum = 0;
		if(a == b && b == c & a == c) {
			sum = 10000 + a * 1000;
		}else if(a == b || b == c || c == a) {
			if(a == b) {
				sum = 1000 + a * 100;
			}else if(b==c){
				sum = 1000 + b * 100;
			}else{
				sum = 1000 + c * 100;
			}
		}if(a != b && b != c && c != a) {
			sum = ((a > b) ? (a>c?a:c) : (b>c?b:c)) * 100;
		}
		System.out.printf("%d %d %d\n",a,b,c);
		System.out.println(sum);
	}
}
