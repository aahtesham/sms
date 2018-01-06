package com.codeshark.sms.service;

import com.codeshark.sms.domain.User;

public interface IUserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
