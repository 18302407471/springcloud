package com.cloud.feign.feign.controller;

import com.cloud.feign.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：dhl
 * @date ： 2019/7/22 13:47
 * @description：
 * @version:
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(String name){
        return helloService.sayHello()+""+name;
    }
}
