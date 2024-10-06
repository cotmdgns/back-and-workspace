package com.server.record.service;

import com.server.record.config.SecurityConfig;
import com.server.record.domain.UserTable;
import com.server.record.repo.UserTableDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserTableService {

    @Autowired
    private UserTableDAO dao;

    @Autowired
    private PasswordEncoder bcpe;

    public void signup(UserTable uvo){
        //uvo.setUserPwd(bcpe.encode(uvo.getUserPwd()));
        dao.save(uvo);
    }


}
