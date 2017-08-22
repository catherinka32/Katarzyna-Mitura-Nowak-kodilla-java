package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("log1");
        //When
        String result = Logger.getInstance().getLastLog();
        System.out.println("Last log is: " + result);
        //Then
        Assert.assertEquals("log1", result);
    }
}

