package com.kh.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@AllArgsConstructor
public class book {
	
	private int bk_no;
	private String bk_title;
	private String bk_author;
	private int bk_price;
	private int pub_no;
	@Override
	public String toString() {
		return bk_no + " | " + bk_title + " | " + bk_author + " | " + bk_price+ " | " + pub_no;
	}
	
}
