package com.kodilla.patterns2.observer.forum;

import com.kodilla.patterns2.observer.forum.ForumTopic;
import com.kodilla.patterns2.observer.forum.ForumUser;
import com.kodilla.patterns2.observer.forum.JavaHelpForumTopic;
import com.kodilla.patterns2.observer.forum.JavaToolsForumTopic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();

        ForumUser marcelToulemonde = new ForumUser("Marcel Toulemonde");
        ForumUser alexiejTorenko = new ForumUser("Aliexiej Torenko");
        ForumUser juliaNovak = new ForumUser("Julia Novak");

        javaHelpForum.registerObserver(juliaNovak);
        javaToolsForum.registerObserver(juliaNovak);
        javaHelpForum.registerObserver(alexiejTorenko);
        javaHelpForum.registerObserver(marcelToulemonde);
        javaToolsForum.registerObserver(marcelToulemonde);
        //When
        javaHelpForum.addPost("Could you explain me pliss what I've done?");
        javaHelpForum.addPost("No, it's no so simple");
        javaHelpForum.addPost("I know...but try");
        javaToolsForum.addPost("I forgot everything, what can I do?");
        javaToolsForum.addPost("There is not good answer, maybe yuo should change hobby :P");
        //Then
        assertEquals(5, marcelToulemonde.getUpdateCount());
        assertEquals(5, juliaNovak.getUpdateCount());
        assertEquals(3,alexiejTorenko.getUpdateCount());
    }
}
