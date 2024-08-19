package com.kh.pratice.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Sign {
	private String id;
	private String password;
	private String name;
	private String email;
	private String date;
	private String phone;
	private String address;
	private String userDate;
	private String img1;
	private String img2;
}
