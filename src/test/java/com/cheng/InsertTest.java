package com.cheng;

import com.cheng.dao.CustomerMapper;
import com.cheng.dao.UserMapper;
import com.cheng.entity.Customer;
import com.cheng.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

/**
 * Created by niecheng on 2019/6/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InsertTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 测试添加用户
     * 没有主键的话，MP会通过雪花算法得到的,但只适用于属性类型为long的，否则会有参数类型不匹配的问题
     */
    @Test
    public void insertUser() {
        User user = new User();
        user.setAge(31);
        user.setRealName("向东");
        user.setManagerId(1088248166370832385L);
        user.setEmail("xd@baomidou.com");
        user.setCreateTime(LocalDateTime.now());
        int rows = userMapper.insert(user);
        System.out.println("影响记录数："+rows);
    }

    @Test
    public void insertCustomer() {
        Customer customer = new Customer();
        customer.setId("123");
        customer.setAge(32);
        customer.setName("胡汉三");
        customer.setCreateTime(LocalDateTime.now());
        int rows = customerMapper.insert(customer);
        System.out.println("影响记录数："+rows);
    }
}
