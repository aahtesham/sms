package com.codeshark.sms.dao;

import com.codeshark.sms.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("userRepository")
public interface UserDao extends JpaRepository<User, Long> {
    User findByEmail(String email);
}