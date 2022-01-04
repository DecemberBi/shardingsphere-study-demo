package com.biykcode.shardingspherejdbcpropertiesmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biykcode.shardingspherejdbcpropertiesmybatis.entity.User;
import com.biykcode.shardingspherejdbcpropertiesmybatis.service.UserService;

/**
 *
 * @author biyukun@kkworld.com
 * @date 2021/12/28
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") Integer id) {
        return userService.getUser(id);
    }
}
