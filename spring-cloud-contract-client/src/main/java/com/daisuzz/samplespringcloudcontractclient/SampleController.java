package com.daisuzz.samplespringcloudcontractclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private final UserClient client;

    public SampleController(UserClient client) {
        this.client = client;
    }

    @GetMapping("sample")
    public User sample() {
        return client.getUser();
    }
}
