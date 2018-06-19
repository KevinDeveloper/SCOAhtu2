package com.kevin.springcloud.oauth.servicehi.service;

import com.kevin.springcloud.oauth.servicehi.User;
import com.kevin.springcloud.oauth.servicehi.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @Author: Kevin
 * @Date: 2018/6/15 15:39
 */
@Service
public class UserServiceImpl implements UserService {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        String hash = encoder.encode(user.getPassword());
        user.setPassword(hash);
        user = userRepository.save(user);
        return user;
    }
}
