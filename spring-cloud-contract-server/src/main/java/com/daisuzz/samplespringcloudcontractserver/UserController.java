package com.daisuzz.samplespringcloudcontractserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("users/{id}")
    private User getUser(@PathVariable String id) {

        return new User("1", "Yamada", "Taro", 20);
    }

    @GetMapping("users")
    private List<User> getUsers() {
        return List.of(new User("1", "Yamada", "Taro", 20),
                new User("2", "Suzuki", "Ichiro", 30));
    }
}
