package com.springcloudalibaba.serverprovider.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderController {


    @RequestMapping("/orders/{uid}")
    public String list(@PathVariable int uid) {
        log.info(uid + "");
        return "订单服务" ;
    }
}
