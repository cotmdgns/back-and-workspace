package com.kh.example.practice1;

import java.util.ArrayList;
import java.util.Collections;

public class Apllication {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		boolean run = true;
		int count = 0;
		
		for(int i = 0; i<6;i++) {
			int random = (int)(Math.random()*45)+1;
			list.add(random);
		}
		Collections.sort(list);
		
		
		while(run) {
			for(int i = 0; i<list.size();i++) {
				int random = (int)(Math.random()*45)+1;
				list2.add(random);
			}
			Collections.sort(list2);
			count++;
			if(list.equals(list2)) {
				System.out.println("로또 번호 : "+list); // 로또 번호
				System.out.println("내 번호 : "+list2);
				System.out.println("횟수 : " + count);
				run = false;
			}else {
				System.out.println("로또 번호 : "+list); // 로또 번호
				System.out.println("내 번호 : "+list2);
			}
			list2.clear();
		}		
	}
}
