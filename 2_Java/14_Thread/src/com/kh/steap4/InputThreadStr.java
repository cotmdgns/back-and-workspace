package com.kh.steap4;

import javax.swing.JOptionPane;


public class InputThreadStr extends Thread {
	
	InputThredTest process;
	
	public InputThreadStr(InputThredTest process) {
		this.process = process;
	}
	
	public void run() {
		// 1. 데이터 입력 작업
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요.."); // 창
		System.out.println("입력하신 숫자는 " + input + " 입니다");
		
		process.check = true;
	}
}
