package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void testLog() {
        Logger.getInstance().log("firstLog");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String result = Logger.getInstance().getLastLog();
        System.out.println("Current log: " + result);
        //Then
        Assert.assertEquals("firstLog", result);
    }
}

