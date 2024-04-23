package com.abhishek.springcloudeurekafeignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client")
public interface FeignClientController {
    @RequestMapping("/get-from-eureka-client")
    String greeting();
}
