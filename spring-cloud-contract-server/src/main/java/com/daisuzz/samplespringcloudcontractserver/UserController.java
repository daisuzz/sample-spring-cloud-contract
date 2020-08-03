package com.daisuzz.samplespringcloudcontractserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("user")
    private User getUser() {

        return new User("Yamada", "Taro", 20);
    }
}
