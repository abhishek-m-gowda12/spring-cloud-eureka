package com.abhishek.springcloudeurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
@SpringBootApplication
public class SpringCloudEurekaFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaFeignClientApplication.class, args);
	}

	@Autowired
	private FeignClientController feignClient;

	@RequestMapping("/get-from-eureka-client")
	public String getInfoFromClient() {
		return feignClient.greeting();
	}
}
