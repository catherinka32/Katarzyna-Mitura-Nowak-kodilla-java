package com.kodilla.stream.forums;

import java.time.LocalDate;

/**
 * Created by Iga on 26.07.2017.
 */
public final class ForumUser {
    private final String username;
    private final int userID;
    private final char sex;
    private final int numberOfPosts;
    private final LocalDate birthDate;

    public ForumUser(String username, int userID, char sex, int numberOfPosts, int yearOfBirth, int monthOfBirth, int dayOfBirth ) {
        this.username = username;
        this.userID = userID;
        this.sex = sex;
        this.numberOfPosts = numberOfPosts;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return userID;
    }

    public char getSex() {
        return sex;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", userID=" + userID +
                ", sex=" + sex +
                ", numberOfPosts=" + numberOfPosts +
                ", birthDate=" + birthDate +
                '}';
    }
}
