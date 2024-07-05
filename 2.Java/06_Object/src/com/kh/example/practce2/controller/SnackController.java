package com.kh.example.practce2.controller;

import com.kh.example.practce2.model.Snack;

public class SnackController {
	
	private Snack s = new Snack();
	// 클래스 내에서만 사용할려고
	
	public String saveData(String kind,
			String name, String flavor, int numOf, int price) {
		// 데이터를 setter 를 이용해 저장하고 "저장 완료되었습니다." 결과를 반환
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장되었습니다";
	}
	
	public String confirmDate() {
		// 저장된 데이터를 반환
		return s.getKind() + "(" + s.getName() + "-" + s.getFlavor() + ") " + s.getNumOf() + "개" + s.getPrice() +"원";
	}
}
