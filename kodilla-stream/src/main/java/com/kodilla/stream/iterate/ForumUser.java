package com.kodilla.stream.iterate;

/**
 * Created by Iga on 26.07.2017.
 */
public final class ForumUser {
    private final String username;
    private final String realName;

    public ForumUser(final String username, final String realName){
        this.username = username;
        this.realName = realName;
    }
    public String getRealName() {
        return realName;
    }
    public String getUsername() {
        return username;
    }
}
