package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
         World world = new World();
        //When
        BigDecimal pq= world.getPeopleQuantity();
        System.out.println(pq);
        //Then
        Assert.assertEquals(new BigDecimal(394000000),pq);

    }
}
