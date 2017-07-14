package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

 /* Created by Mitura on 2017-07-14.
 */
public class ForumTestSuit {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suit: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end ");
    }
    @Test
    public void testCaseUsername(){
        //
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Testing " + result);
        //
        Assert.assertEquals("theForumUser", result);
    }
    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //
        Assert.assertEquals("John Smith", result);
    }
}
