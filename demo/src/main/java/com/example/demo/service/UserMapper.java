package com.example.demo.service;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserVo test();
}
