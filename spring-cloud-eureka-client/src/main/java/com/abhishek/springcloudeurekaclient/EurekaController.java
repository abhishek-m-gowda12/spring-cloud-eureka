package com.abhishek.eurekaclient1;

import org.springframework.web.bind.annotation.RequestMapping;

public interface Client2Controller {
    @RequestMapping("/get-from-client2")
    String greeting();
}
