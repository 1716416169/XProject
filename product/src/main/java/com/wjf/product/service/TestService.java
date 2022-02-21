package com.wjf.product.service;

import com.alibaba.nacos.shaded.com.google.gson.JsonObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("TestService")
@Component
public interface TestService {
    @RequestMapping(method = RequestMethod.GET, value = "/test/{name}", consumes = "application/json")
    String getUser(@PathVariable String name);
}
