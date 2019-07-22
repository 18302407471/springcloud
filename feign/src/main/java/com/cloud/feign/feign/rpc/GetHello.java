package com.cloud.feign.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "ribbon-consumer")
public interface GetHello {
    @GetMapping(value = "/hello?name=feign")
    public String sayHello();
}