package com.springcloudalibaba.serverconfigclient.controller;


import com.springcloudalibaba.serverconfigclient.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService ;

    @RequestMapping("/orders/{uid}")
    public String UserOrders(@PathVariable int uid) {
        userService.getOrders(uid) ;
        return "Hello" ;
    }


}
