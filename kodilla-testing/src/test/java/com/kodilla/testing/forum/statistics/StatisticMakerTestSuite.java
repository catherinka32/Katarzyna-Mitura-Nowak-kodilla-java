package com.kodilla.testing.forum.statistics;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Iga on 17.07.2017.
 */
public class StatisticMakerTestSuite {
    @Test
    public void testCalculateAdvStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("Agnieszka");
        nameList.add("Marek");
        nameList.add("Gosia");
        nameList.add("Kasia");
        nameList.add("Jurek");

        int comments = 20;
        int posts = 400;

        when(statisticsMock.usersNames()).thenReturn(nameList);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);

        StatisticMaker statisticMaker = new StatisticMaker(statisticsMock);
        //When
        System.out.println(statisticMaker.getAmountOfUsers());
        int result = statisticMaker.getAmountOfUsers();
        //Then
        Assert.assertEquals(5, result);
    }
}
