package com.kh.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/01_Ajaxx")
	public String ajax1() {
		return "01_count";
	}
	
	@GetMapping("/02_Ajaxx")
	public String ajax2() {
		return "02_encoding";
	}
	
	@GetMapping("/03_Ajaxx")
	public String ajax3() {
		return "03_register";
	}
	
	@GetMapping("/04_Ajaxx")
	public String ajax4() {
		return "04_serialize";
	}
}
