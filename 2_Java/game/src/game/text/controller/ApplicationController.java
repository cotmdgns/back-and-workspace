package game.text.controller;

import game.text.model.moster;
import game.text.model.mypage;

public class ApplicationController {

	private mypage my = new mypage();
	private moster mo = new moster();
	private moster[] mos = new moster[4];
	
	public void my() {
		String rank = "전사";
		int level = 1;
		int shortexp = 0;
		int longexp = 50;
		int hp = 150;
		int attck = 20;
		int slied = 5;
		int healingpotion = 0;
		int gold = 1000;
		my = new mypage(my.getName(), rank, level, shortexp, longexp, hp, attck, slied, healingpotion, gold);
	}

	public void monster(moster mo) {
		for(int i=0;i<mos.length;i++) { 
			mos[i] = new moster(mo.getMonstername(),mo.getMonsterhp(),mo.getMonsterattck(),
					mo.getMonstershild(),mo.getMonsterexp(),mo.getExplanation());
		}
	}
}