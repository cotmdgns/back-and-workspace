package com.kh.example.practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Apllication {

	public static void main(String[] args) {
		
		//쌤이한거
		ArrayList<Integer> lotto = new ArrayList();
		
		// 기존 로또 번호는 6개, 보너스 번호가 필요해서 1개  더 추가!
		while(lotto.size() < 7) {
			int num = (int)(Math.random()*45+1);
			if(!lotto.contains(num)) {
				lotto.add(num);
			}
		}
		
		// 0 ~ 6까지 범위 지정해서 로또 번호 6개 따로, 보너스 번호 따로!
		List<Integer> lottoList = lotto.subList(0, 6);
		int bonus = lotto.get(6);
		
		int conut = 0;
		while(true) {
			conut++;
			ArrayList<Integer> myLotto = new ArrayList();
			while(myLotto.size() < 6) {
				int num = (int)(Math.random() * 45 + 1);
				if(!myLotto.contains(num)) {
					myLotto.add(num);
				}
			}
			System.out.println("로또 번호 : " + lottoList);
			System.out.println("내 번호 : " + myLotto);
			Collections.sort(lottoList);
			Collections.sort(myLotto);
			// 멈추는 조건! 로도 번호와 내 반호가 정확히 일치! 1등 당첨
//			if(lottoList.equals(myLotto)) {
//				System.out.println("1등 당첨! 횟수 : " + conut);
//				break;
//			}
			
			int match = 0;
			for(Integer num : lottoList) {
				if(myLotto.contains(num)) {
					match++;	
				}
				
			}
			if (match == 5) {
				if(myLotto.contains(bonus)) {
					System.out.println("2등 담청! 보너스 번호 "+bonus+"횟수 : " + conut);
					break;
				}else {
					System.out.println("3등 담청! 횟수 : " + conut);
					break;
				}
				
			}else if(match == 4) {
				System.out.println("4등 담청! 횟수 : " + conut);
				break;
			}else if(match == 3) {
				System.out.println("5등 담청! 횟수 : " + conut);
				break;
			}
		
		}
		
		
		
		
		
		
		
		
		// 내가한거 
//		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<Integer> list2 = new ArrayList<>();
//		boolean run = true;
//		int count = 0;
//		
//		for(int i = 0; i<6;i++) {
//			int random = (int)(Math.random()*45)+1;
//			list.add(random);
//		}
//		Collections.sort(list);
//		
//		
//		while(run) {
//			for(int i = 0; i<list.size();i++) {
//				int random = (int)(Math.random()*45)+1;
//				list2.add(random);
//			}
//			Collections.sort(list2);
//			count++;
//			if(list.equals(list2)) {
//				System.out.println("로또 번호 : "+list); // 로또 번호
//				System.out.println("내 번호 : "+list2);
//				System.out.println("횟수 : " + count);
//				run = false;
//			}else {
//				System.out.println("로또 번호 : "+list); // 로또 번호
//				System.out.println("내 번호 : "+list2);
//			}
//			list2.clear();
//		}		
	}
}
