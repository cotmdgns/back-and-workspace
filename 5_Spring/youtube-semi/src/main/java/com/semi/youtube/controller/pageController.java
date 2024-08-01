package com.semi.youtube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.semi.youtube.controller.service.VideoService;

@Controller
public class pageController {
	
	@Autowired
	private VideoService video;
	
	@GetMapping("/")
	public String index(Model model){
		model.addAttribute("list", video.allVideo());
		return "index";
	}
}
