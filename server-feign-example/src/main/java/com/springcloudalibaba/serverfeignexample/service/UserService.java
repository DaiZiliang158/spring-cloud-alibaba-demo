package com.springcloudalibaba.serverfeignexample.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("server-provider")
public interface UserService {

    @RequestMapping("orders/{id}")
    String getDate(@PathVariable int id) ;
}
