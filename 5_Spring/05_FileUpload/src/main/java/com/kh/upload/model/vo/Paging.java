package com.kh.upload.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Paging {

	private int page = 1; 	//현재 페이지
	
	private int offset = 0;	//시작위치
	private int limit = 10; //레코드 수
	
}
