package com.kodilla.testing.user;

/**
 * Created by Mitura on 2017-07-13.
 */
public class SimpleUser {
    String username;
    String realName;

    public SimpleUser(String username, String realName){
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }
    public String getRealName() {
        return realName;
    }

}
