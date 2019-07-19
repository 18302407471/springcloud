package com.cloud.ribbon.ribbon.service;

import org.springframework.stereotype.Service;

/**
 * @author ：dhl
 * @date ： 2019/7/19 13:46
 * @description：服务提供者
 * @version: v1.0
 */
@Service
public class HelloService {

    public String sayHello(){
        return  "helloWorld";
    }
}
