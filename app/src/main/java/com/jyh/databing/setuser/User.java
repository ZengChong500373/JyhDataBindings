package com.jyh.databing.setuser;

/**
 * Created by Administrator on 2017/4/3.
 */

public class User {
    private final String firstName;
    private final String lastName;



    private final Boolean isFriend;

    public User(String firstName, String lastName, Boolean isFriend) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isFriend = isFriend;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public Boolean isFriend() {
        return isFriend;
    }

}
