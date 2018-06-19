package com.kevin.springcloud.oauth.authservice.jpa;

import com.kevin.springcloud.oauth.authservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: UserDao
 * @Description:
 * @Author: Kevin
 * @Date: 2018/6/15 09:14
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String userName);
}
