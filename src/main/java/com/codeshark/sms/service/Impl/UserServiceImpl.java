package com.codeshark.sms.service.Impl;

import com.codeshark.sms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService{


    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;



}
