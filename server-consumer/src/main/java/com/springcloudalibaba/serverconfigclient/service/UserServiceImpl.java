package com.springcloudalibaba.serverconfigclient.service;

import com.springcloudalibaba.serverconfigclient.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private RestTemplate restTemplate ;


    @Override
    public String getOrders(int uid) {
        return restTemplate.getForObject("http://server-provider/orders/" + uid
                ,String.class);
    }
}
