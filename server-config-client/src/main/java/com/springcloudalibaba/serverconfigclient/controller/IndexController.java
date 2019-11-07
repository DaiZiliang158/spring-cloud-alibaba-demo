package com.springcloudalibaba.serverconfigclient.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
//动态刷新配置
@RefreshScope
public class IndexController {

    @Value("${email}")
    private String email ;

    @GetMapping("/")
    public String hello() {
        log.info(email);
        return "配置中心" ;
    }
}
