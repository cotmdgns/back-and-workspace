package com.example.demo.web;

import com.example.demo.service.UserService;
import com.example.demo.service.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    @ResponseBody // 👈 이 어노테이션을 붙이면 화면을 찾지 않고 브라우저에 리턴값을 바로 출력합니다.
    public UserVo test(){ // 리턴 타입을 UserVo로 변경
        UserVo vo = service.test();
        System.out.println("vo : " + vo);
        return vo;
    }

}
