package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials millenials = new Millenials("Milly");
        YGeneration ygeneration = new YGeneration("Genery");
        ZGeneration zGeneration = new ZGeneration("Generz");
        //When
        String MillyMedia = millenials.sharePost();
        System.out.println("Usually Milly says: " + MillyMedia);
        String GeneryMedia = ygeneration.sharePost();
        System.out.println("Usually Genery says: " + GeneryMedia);
        String GenerzMedia = zGeneration.sharePost();
        System.out.println("Usually Generz says: " + GenerzMedia);
        //Then
        Assert.assertEquals("I am using Twitter", MillyMedia);
        Assert.assertEquals("I am using Facebook", GeneryMedia);
        Assert.assertEquals("I am using Snapchat", GenerzMedia);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials millenials = new Millenials("Milly");
        //When
        String MillyMedia = millenials.sharePost();
        System.out.println("Usually Milly says: " + MillyMedia);
        millenials.setFavoriteMedia(new FacebookPublisher());
        MillyMedia = millenials.sharePost();
        System.out.println("Today Milly says: "+ MillyMedia);
        //Then
        Assert.assertEquals("I am using Facebook", MillyMedia);
        }
    }