package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {5,7,8,10,14,12,13};
        AverageExecutor averageExecutor = new AverageExecutor(numbers);
        //When
        double average = averageExecutor.getAverage(numbers);
        //Then
        Assert.assertEquals(9.85, average, 0.01);
    }
}
