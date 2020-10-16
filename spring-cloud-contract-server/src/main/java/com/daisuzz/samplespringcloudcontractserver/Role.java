package com.daisuzz.samplespringcloudcontractserver;

import java.util.List;

public class Role {

    String id;

    String name;

    List<String> userList;

    public Role(final String id, final String name, final List<String> userList) {
        this.id = id;
        this.name = name;
        this.userList = userList;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<String> getUserList() {
        return userList;
    }

    public void setUserList(final List<String> userList) {
        this.userList = userList;
    }
}
