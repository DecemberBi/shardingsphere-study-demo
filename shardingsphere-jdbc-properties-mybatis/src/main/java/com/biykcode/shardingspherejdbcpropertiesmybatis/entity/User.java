package com.biykcode.shardingspherejdbcpropertiesmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author biyukun
 * @date 2021/12/28
 */
@Data
@AllArgsConstructor
public class User {

    private Long id;

    private String name;

    private Integer age;
}
