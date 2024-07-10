package com.gdgd;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.nextLine());
		int m = Integer.parseInt(sc.nextLine());
		int addT = Integer.parseInt(sc.nextLine()); // 타이머
		int sum = 0;
		
		if((m + addT)>60) {
			sum += (m+addT) % 60;
			h += (m+addT) / 60;
			if(h > 23) {
				h = 0;
			}
			System.out.println(h + " " + sum);
		}else {
			System.out.println(h + " " + sum);
		}		
	}
}

