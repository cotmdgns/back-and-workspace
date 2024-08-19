package com.semi.youtube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.semi.youtube.controller.service.VideoService;
import com.semi.youtube.model.vo.Member;
import com.semi.youtube.model.vo.Subsrcibe;
import com.semi.youtube.model.vo.Video;
import com.semi.youtube.model.vo.VideoLike;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class pageController {
	
	@Autowired
	private VideoService video;
	
	// 비디오 전체 목록 보기
	@GetMapping("/")
	public String index(Model model){
		model.addAttribute("list", video.allVideo());
		return "index";
	}
	
	// 비디오 1개 보여주기
	// 좋아요 관련 정보 가져오기
	// 구독자수, 구독 관련 정보 가져오기
	@GetMapping("/{videoCode}")
	public String detail(@PathVariable("videoCode") int videoCode,Model model) {
		Video data = video.detail(videoCode);
		model.addAttribute("video", data);
		model.addAttribute("list", video.allVideo());
		model.addAttribute("count",video.count(data.getChannel().getChannelCode()));
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Member member = (Member) authentication.getPrincipal();
		VideoLike like = null;
		Subsrcibe sub = null;
		if(member!=null) {
			like = video.checkLike(VideoLike.builder()
					.id(member.getId())
					.videoCode(videoCode)
					.build());
			sub = video.check(Subsrcibe.builder()
					.id(member.getId())
					.channelCode(data.getChannel().getChannelCode())
					.build());
		}
		model.addAttribute("like",like);
		return "detail";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
}
