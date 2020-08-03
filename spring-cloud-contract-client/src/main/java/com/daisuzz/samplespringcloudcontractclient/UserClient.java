package com.daisuzz.samplespringcloudcontractclient;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserClient {

    private final RestTemplate restTemplate;

    public UserClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public User getUser() {
        ResponseEntity<User> response = restTemplate.getForEntity("http://localhost:8082/user", User.class);

        return response.getBody();
    }
}
