package com.daisuzz.samplespringcloudcontractserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @GetMapping("roles/{id}")
    public Role getRole(@PathVariable String id) {
        return new Role("1", "admin", List.of("1"));
    }

    @GetMapping("roles")
    public List<Role> getRoles() {
        return List.of(
                new Role("1", "admin", List.of("1")),
                new Role("2", "operator", List.of("2")));
    }
}
