package com.kevin.springcloud.oauth.authservice.service;

import com.kevin.springcloud.oauth.authservice.jpa.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceDetail
 * @Description:
 * @Author: Kevin
 * @Date: 2018/6/15 09:05
 */
@Service
public class UserServiceDetail implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.findByUsername(username);
    }
}
