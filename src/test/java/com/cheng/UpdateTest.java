package com.cheng;

import com.cheng.dao.UserMapper;
import com.cheng.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by niecheng on 2019/6/10.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UpdateTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void update(){
        List<User> users = userMapper.selectList(null);
        Assert.assertEquals(5, users.size());
        users.forEach(System.out::println);
    }
}
