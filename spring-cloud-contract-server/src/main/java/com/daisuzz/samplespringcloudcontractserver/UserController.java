package com.daisuzz.samplespringcloudcontractserver;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("users")
    @ResponseStatus(HttpStatus.CREATED)
    private String createUser(@RequestBody UserCreateRequest userCreateRequest) {

        User user = new User(
                userCreateRequest.id,
                userCreateRequest.firstName,
                userCreateRequest.lastName,
                userCreateRequest.age
        );

        return user.id;
    }
}
