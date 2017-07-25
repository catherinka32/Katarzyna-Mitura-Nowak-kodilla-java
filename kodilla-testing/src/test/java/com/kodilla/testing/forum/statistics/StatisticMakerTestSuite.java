package com.kodilla.testing.forum.statistics;
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

        int comments = 400;
        int posts = 20;

        when(statisticsMock.usersNames()).thenReturn(nameList);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);

        StatisticMaker statisticMaker = new StatisticMaker(statisticsMock);
        //When
        statisticMaker.calculateAdvStatistics();
        int result1 = statisticMaker.getAmountOfUsers();
        int result2 = statisticMaker.getAmountOfPosts();
        int result3 = statisticMaker.getAmountOfComment();
        double result4 = statisticMaker.getAvarageCommentPerUser();
        double result5 = statisticMaker.getAvaragePostPerUser();
        double result6 = statisticMaker.getAverageCommentPerPost();
        //Then
        Assert.assertEquals(5, result1);
        Assert.assertEquals(20,result2);
        Assert.assertEquals(400,result3);
        Assert.assertEquals(80.0, result4, 0.01);
        Assert.assertEquals(4.0,result5,0.01);
        Assert.assertEquals(20.0,result6,0.01);
    }
}
