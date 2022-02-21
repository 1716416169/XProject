package com.wjf.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wjf.test.entity.User;
import com.wjf.test.mapper.UserMapper;
import com.wjf.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sun.invoke.util.Wrapper;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUsers(String name) throws Exception {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq("name",name);
        List<User> users = userMapper.selectList(queryWrapper);
        return users;
    }

    @Override
    public Integer insertUser(String name) throws Exception {
        User user = new User();
        user.setAge(18);
        user.setName(name);
        int insert = userMapper.insert(user);
        if(insert!=1){
            throw new Exception("插入错误");
        }
        return insert;
    }
}
