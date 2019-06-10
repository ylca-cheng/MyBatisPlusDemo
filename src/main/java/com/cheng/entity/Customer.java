package com.cheng.entity;

import lombok.Data;

import java.time.LocalDateTime;


/**
 * 客户实体类
 * Created by niecheng on 2019/6/4.
 */
@Data
public class Customer {
    /**
     * 用户id
     */
    private String id;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 用户年龄
     */
    private Integer age;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 用户上级id
     */
    private Long managerId;
    /**
     * 用户创建时间
     */
    private LocalDateTime createTime;
}
