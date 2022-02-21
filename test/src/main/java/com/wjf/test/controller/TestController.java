package com.wjf.test.controller;

import com.wjf.test.entity.User;
import com.wjf.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/{name}")
    public Integer insertUser(@PathVariable String name) throws Exception {
        Integer integer = testService.insertUser(name);
        return integer;
    }

    @GetMapping("/{name}")
    public List<User> selectUsers(@PathVariable String name) throws Exception {
        List<User> users = testService.getUsers(name);
        for (User user : users) {
            System.out.println(user.getName());
        }
        return users;
    }
}
