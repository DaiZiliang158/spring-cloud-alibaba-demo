package com.springcloudalibaba.serverfeignexample.controller;


import com.springcloudalibaba.serverfeignexample.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class UserController {

    @Resource
    private UserService userService ;

    @RequestMapping("orders/{id}")
    public String userOrders(@PathVariable int id) {
        return userService.getDate(id) ;
    }

}
