package com.abhishek.springcloudeurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;

public interface EurekaController {
    @RequestMapping("/get-from-eureka-client")
    String greeting();
}
