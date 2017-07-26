package com.kodilla.stream;
import com.kodilla.stream.forum.Forum;
import com.kodilla.stream.forum.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex()== 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear() < 1997)
                .filter(forumUser -> forumUser.getNumberOfPosts()>0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}