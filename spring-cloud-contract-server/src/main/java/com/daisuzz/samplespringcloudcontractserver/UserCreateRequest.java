package com.daisuzz.samplespringcloudcontractserver;

import java.io.Serializable;

public class UserCreateRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    String id;

    String lastName;

    String firstName;

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
