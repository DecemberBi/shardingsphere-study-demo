package com.biykcode.shardingspherejdbcpropertiesmybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biykcode.shardingspherejdbcpropertiesmybatis.entity.User;
import com.biykcode.shardingspherejdbcpropertiesmybatis.mapper.UserMapper;

/**
 *
 * @author biyukun@kkworld.com
 * @date 2021/12/28
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(Integer id) {
        return userMapper.getUser(id);
    }

}
