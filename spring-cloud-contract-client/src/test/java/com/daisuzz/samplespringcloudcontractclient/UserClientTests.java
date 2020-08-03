package com.daisuzz.samplespringcloudcontractclient;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureStubRunner(ids = {"com.daisuzz:sample-spring-cloud-contract-server:+:stubs:8082"}, stubsMode = StubRunnerProperties.StubsMode.LOCAL)
class UserClientTests {

    @Autowired
    UserClient userClient;

    @Test
    public void validateUserStub() {

        User user = userClient.getUser();

        assertEquals(user.lastName, "Yamada");
        assertEquals(user.firstName, "Taro");
        assertEquals(user.age, 20);
    }
}
