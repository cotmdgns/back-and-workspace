package com.kh.practice1.model;

public class Member implements Comparable<Member> {
	
	private String sing;
	private String singer;
	
	public Member() {
	}

	public Member(String sing, String singer) {
		this.sing = sing;
		this.singer = singer;
	}

	public String getSing() {
		return sing;
	}

	public void setSing(String sing) {
		this.sing = sing;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Member [sing=" + sing + ", singer=" + singer + "]";
	}

	@Override
	public int compareTo(Member o) {
		return 0;
	}
}
