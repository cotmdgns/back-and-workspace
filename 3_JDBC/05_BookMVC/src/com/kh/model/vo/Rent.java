package com.kh.model.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@AllArgsConstructor
public class Rent {
	
	public int rentNo;
	public int rentMemBo;
	public Book book;
	public Date rentDate;
	
}
