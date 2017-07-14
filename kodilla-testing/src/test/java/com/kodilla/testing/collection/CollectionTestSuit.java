package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

/**
 * Created by Mitura on 2017-07-14.
 */
public class CollectionTestSuit {
    @Before
    public void before(){
        System.out.println("TestCase: begin");
    }
    @After
    public void after() {
        System.out.println("TestCase: end");
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
    public void testOddNumbersExterminatorEmptyList(){
            //Given
            ArrayList<Integer> numbersList = new ArrayList<Integer>();
            OddNumbersExterminator oddExterminator = new OddNumbersExterminator();
            ArrayList<Integer> myList = new ArrayList<Integer>();
            //When
            ArrayList<Integer> result = oddExterminator.exterminate(numbersList);
            //Then
            Assert.assertEquals(myList, result);
        }
    @Test
    public void testOddNumbersExterminatorNormalList(){
            //Given
            ArrayList<Integer> numbersList = new ArrayList<Integer>();
            numbersList.add(5);
            numbersList.add(10);
            numbersList.add(15);
            numbersList.add(3);
            numbersList.add(8);
            numbersList.add(7);
            numbersList.add(11);
            numbersList.add(42);
            numbersList.add(15);
            numbersList.add(74);
            numbersList.add(68);
            OddNumbersExterminator oddExterminator = new OddNumbersExterminator();
            ArrayList<Integer> myList = new ArrayList<Integer>();
            myList.add(10);
            myList.add(8);
            myList.add(42);
            myList.add(74);
            myList.add(68);
            //When
            ArrayList<Integer> result = oddExterminator.exterminate(numbersList);
            //Then
            Assert.assertEquals( myList, result);
    }
}
