package com.kevin.springcloud.oauth.servicehi;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: UserRepository
 * @Description:
 * @Author: Kevin
 * @Date: 2018/6/15 15:29
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
