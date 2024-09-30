package com.server.record.controller;

import com.server.record.domain.UserTable;
import com.server.record.service.UserTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/*")
@CrossOrigin(origins= {"*"},maxAge=6000)
public class UserTableController {

    @Autowired
    private UserTableService service;

    @PostMapping("/record")
    public ResponseEntity signup(UserTable table){
        service.signup(table);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
