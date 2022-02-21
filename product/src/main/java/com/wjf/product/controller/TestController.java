package com.wjf.product.controller;

import com.alibaba.nacos.shaded.com.google.gson.JsonObject;
import com.wjf.product.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product/test")
@RefreshScope
@EnableDiscoveryClient
@EnableFeignClients
public class TestController {
    @Autowired
    TestService testService;
    @GetMapping("/{name}")
    public String getUser(@PathVariable String name){
        String user = testService.getUser(name);
        System.out.println(user);
        return user;
    }
}
