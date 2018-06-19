package com.kevin.springcloud.oauth.authservice.service;

import com.kevin.springcloud.oauth.authservice.entity.User;

/**
 * @ClassName: UserService
 * @Description:
 * @Author: Kevin
 * @Date: 2018/6/15 17:23
 */
public interface UserService {
    void create(User user);
}
