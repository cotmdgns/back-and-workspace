package game.text.controller;

import game.text.model.moster;
import game.text.model.mypage;

public class ApplicationController {

	private mypage my = new mypage();
	private moster mo = new moster();
	private moster[] mos = new moster[4];
	
	public void mypage(mypage my) { // 리턴값을 받고 출력하기 
		System.out.println(mo.toString());
	}
	
	public void monster(moster mo) {
		for(int i=0;i<mos.length;i++) { 
			mos[i] = new moster(mo.getMonstername(),mo.getMonsterhp(),mo.getMonsterattck(),
					mo.getMonstershild(),mo.getMonsterexp(),mo.getExplanation());
		}
	}
	public mypage printf() {
		return my;
	}
}