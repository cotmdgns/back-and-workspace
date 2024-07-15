package com.gdgd;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		int T = sc.nextInt();
		int sum = 0;
		H += (M+T) / 60;
		sum = (M+T) % 60;
		if((M+T)>=60) {
			if(H > 23){
				H -= 24;
			}
			System.out.println(H + " " + sum);
		}else {
			System.out.println(H + " " + sum);
		}
		
	}
}
