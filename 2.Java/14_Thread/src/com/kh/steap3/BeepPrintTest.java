package com.kh.steap3;

import java.awt.Toolkit;

public class BeepPrintTest {

	public static void main(String[] args) {
		
		// 경고음 5번 울리는 작업
//		Toolkit tool = Toolkit.getDefaultToolkit();
//		for(int i = 0 ; i < 5 ; i++) {
//			tool.beep();
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		
		beep bp = new beep();
		Thread thread = new Thread(bp);
		thread.start();
		
		beepsound bp2 = new beepsound();
		bp2.start();
		
		
	}
}
