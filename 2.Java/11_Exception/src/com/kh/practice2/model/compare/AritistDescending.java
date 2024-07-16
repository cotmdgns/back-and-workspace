package com.kh.practice2.model.compare;

import java.util.Comparator;

import com.kh.practice2.model.Music;

public class AritistDescending implements Comparator<Music>{
	
	
	@Override
	public int compare(Music o1, Music o2) {
		return o2.getArtist().compareTo(o1.getArtist());
	}
}
