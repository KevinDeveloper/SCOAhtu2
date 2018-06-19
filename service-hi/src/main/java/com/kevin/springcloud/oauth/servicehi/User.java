package com.kevin.springcloud.oauth.servicehi;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @ClassName: User
 * @Description:
 * @Author: Kevin
 * @Date: 2018/6/15 14:50
 */
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", unique = true, nullable = true)
    private String userName;
    @Column(name = "password")
    private String password;


}
