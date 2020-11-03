package com.daisuzz.samplespringcloudcontractserver;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

public class UserCreateRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    String id;

    @Pattern(regexp = "[a-zA-Z]*")
    String lastName;

    @Pattern(regexp = "[a-zA-Z]*")
    String firstName;

    @Min(0)
    @Max(100)
    Integer age;

    UserCreateRequest(String id, String lastName, String firstName, Integer age) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
