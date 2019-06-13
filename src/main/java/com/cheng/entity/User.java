package com.cheng.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;


/**
 * 用户实体类
 * mp默认数据库字段用下划线连接，实体类采用驼峰命名法
 * @TableName 用于表明和实体类名不同
 * @TableId 用于标记主键，mp默认主键为id，
 * @TableField 用于数据库字段和实体类属性不一致
 *
 * 忽略类属性，让mp不去查询类属性对应的字段：
 * transient 关键字可以标记属性不参与序列化，mp则不会去查询该属性对应的字段，可防止有些属性在数据库中没有对应字段
 * 也可以设置类属性为静态的，mp同样会忽略该属性，设置为静态属性后需要设置set和get方法，lombok不会为静态属性添加get和set方法
 * 第三种方法则是在类属性上添加注解@TableField(exist = false)，mp同样也会忽略该属性
 * Created by niecheng on 2019/6/4.
 */
@Data
@TableName("mp_user")
public class User {
    /**
     * 用户id
     */
    @TableId
    private Long userId;
    /**
     * 用户名称
     */
    @TableField("name")
    private String realName;
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

    /**
     * 备注信息
     */
    private transient String remake;
}
