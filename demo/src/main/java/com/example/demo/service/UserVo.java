package com.example.demo.service;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserVo {

    private int userCode;
    private String id;
    private String pwd;

}

