package com.kh.practice2.model.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice2.model.Music;
import com.kh.practice2.model.compare.AritistDescending;
import com.kh.practice2.model.compare.SongAscending;

public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>();
	
	// 1. 마지막 위치에 추가한다
	public boolean addLastList(Music music) {
		if(!music.getArtist().equals("") && !music.getSong().equals("")) {
			return list.add(music);
		}
		return false;
	}
	public boolean addFirstList(Music music) { // 첫 위치에 추가한다.
		if(!music.getArtist().equals("") && !music.getSong().equals("")) {
			list.add(0, music);
			return true;
		}
		return false;
	}
	public ArrayList<Music> printfAll() { // 전체 곡 목록 출력
		return list;
	}
	public Music searchMusic(String song) {// 특정 곡 검색
		for(Music music : list) {
			if(music.getSong().contains(song)) {
				return music;
			}
		}
		return null;
	}
	public Music removeMusic(String song) { // 특정 곡 삭제
		for(Music music : list) {
			if(music.getSong().equals(song)) {
				return list.remove(list.indexOf(music));
			}
		}
		return null;
	}
	public Music UpdateMusic(String search,Music update) { // 특정 곡 수정
		for(Music music : list) {
			if(music.getSong().equals(search)) {
				return list.set(list.indexOf(music), update);
			}
		}
		return null;
	}
	public ArrayList<Music> descArtist() { // 가수명 내림차순 정렬
		ArrayList<Music> clonList = (ArrayList<Music>) list.clone();
		Collections.sort(clonList, new AritistDescending());
		return clonList;
	}
	public ArrayList<Music> ascSong() { // 가수명 오름차순 정렬
		ArrayList<Music> clonList = (ArrayList<Music>) list.clone();
		Collections.sort(clonList, new SongAscending());
		return clonList;
	}
}
