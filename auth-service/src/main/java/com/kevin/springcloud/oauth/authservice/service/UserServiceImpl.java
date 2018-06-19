package com.kevin.springcloud.oauth.authservice.service;

import com.kevin.springcloud.oauth.authservice.entity.User;
import com.kevin.springcloud.oauth.authservice.jpa.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @Author: Kevin
 * @Date: 2018/6/15 17:24
 */
@Service
public class UserServiceImpl implements UserService {

    //private final Logger log = LoggerFactory.getLogger(getClass());

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserDao userDao;

    @Override
    public void create(User user) {

        User existing = userDao.findByUsername(user.getUsername());
        //Assert.isNull(existing, "user already exists: " + user.getUsername());

        String hash = encoder.encode(user.getPassword());
        user.setPassword(hash);
        userDao.save(user);

    }
}