package com.kh.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@AllArgsConstructor
public class Member {
	
	private int memberNo;
	private String memberId;
	private String menberPwd;
	private String memberName;
	private char gender;
	private String address;
	private String phone;
	private char status;
	private String enrollDate;
}
