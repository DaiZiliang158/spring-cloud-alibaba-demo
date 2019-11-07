package com.springcloudalibaba.serverprovider.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderController {

    @Value("${server.port}")
    private int port ;
    @RequestMapping("/orders/{uid}")
    public String list(@PathVariable int uid) {
        log.info(uid + "");
        return port + "订单服务" ;
    }
}
