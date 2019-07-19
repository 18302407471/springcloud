package com.cloud.ribbon.consumer.ribbonconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：dhl
 * @date ： 2019/7/19 14:45
 * @description：消费者
 * @version: v.10
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String sayHello(){
        return restTemplate.getForObject("http://ribbon-provider/hello?name=zhangtaifeng",String.class);
    }


}
