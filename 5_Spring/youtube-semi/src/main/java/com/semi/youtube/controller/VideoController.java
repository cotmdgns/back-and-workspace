package com.semi.youtube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.semi.youtube.controller.service.VideoService;
import com.semi.youtube.model.vo.Member;
import com.semi.youtube.model.vo.VideoLike;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class VideoController {
	
	@Autowired
	private VideoService video;
	
	// 좋아요
	@ResponseBody
	@PostMapping("/like")
	public void like(HttpServletRequest request,int code) {
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("vo");
		
		VideoLike data = VideoLike.builder() // 빌더와 빌드 사이넣기
				.id(member.getId())
				.videoCode(code)
				.build();
		video.like(data);
	}
	
	// 좋아요 취소
	@ResponseBody
	@PostMapping("/unlike")
	public void unlike(int code) {
		video.unlike(code);
	}
	
	// 댓글 작성
	
	//댓글 수정	
	
	//좋아요 석제
	
	// 구독
	
	// 구독 취소
}
