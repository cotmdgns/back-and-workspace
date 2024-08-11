package com.kh.Ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {
	
	@GetMapping("/01_Ajaxx")
	public String ajax1() {
		return "count";
	}
	
	@GetMapping("/02_Ajaxx")
	public String ajax2() {
		return "encoding";
	}
	
	@GetMapping("/03_Ajaxx")
	public String ajax3() {
		return "register";
	}
	
	@GetMapping("/04_Ajaxx")
	public String ajax4() {
		return "serialize";
	}
}
