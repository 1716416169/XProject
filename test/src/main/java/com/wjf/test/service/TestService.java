package com.wjf.test.service;


import com.wjf.test.entity.User;

import java.util.List;

public interface TestService {
    public List<User> getUsers(String name) throws Exception;
    public Integer insertUser(String name) throws Exception;
}
