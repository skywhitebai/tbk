package com.sky.tbk.controller;

import com.sky.tbk.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 用户管理
 *
 * @author skywhite
 * @date 2018/11/28
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getuser")
    public User getUser() {
        User user = new User();
        user.setUserName("test");
        return user;
    }
}
