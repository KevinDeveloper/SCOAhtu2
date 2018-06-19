package com.kevin.springcloud.oauth.servicehi.controller;

import com.kevin.springcloud.oauth.servicehi.User;
import com.kevin.springcloud.oauth.servicehi.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description:
 * @Author: Kevin
 * @Date: 2018/6/15 15:49
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public User createUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        return userService.create(user);
    }

}
