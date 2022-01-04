package com.biykcode.shardingspherejdbcpropertiesmybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.biykcode.shardingspherejdbcpropertiesmybatis.entity.User;

/**
 *
 * @author biyukun@kkworld.com
 * @date 2021/12/28
 */
@Mapper
public interface UserMapper {

    User getUser(Integer id);

}
