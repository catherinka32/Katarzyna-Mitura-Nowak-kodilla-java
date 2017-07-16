package com.kodilla.testing.shape;

import org.junit.*;

/**
 * Created by Mitura on 2017-07-15.
 */
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Tis is the beginning of tests");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure(){
        //Given
        Circle circle = new Circle(7);
        ShapeCollector figureCollector = new ShapeCollector();
        //When
        figureCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1, figureCollector.getListSize());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        Circle circle = new Circle(7);
        ShapeCollector figureCollector = new ShapeCollector();
        figureCollector.addFigure(circle);
        //When
        boolean result = figureCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, figureCollector.getListSize());
    }
    @Test
    public void testShowFigures(){
        //Given
        Circle circle = new Circle(7.0);
        Triangle triangle = new Triangle(2.0, 4.0);
        Square square = new Square(4.0);
        ShapeCollector figureCollector = new ShapeCollector();
        figureCollector.addFigure(circle);
        figureCollector.addFigure(triangle);
        figureCollector.addFigure(square);
        //When
        boolean result;
        result = figureCollector.showFigures().contains("This is circle, its field amounts 153.93804002589985");
        result = result && figureCollector.showFigures().contains("This is triangle, its field amounts 4.0");
        result = result && figureCollector.showFigures().contains("This is square, its field amounts 16");
        //Then
        System.out.println(figureCollector.showFigures());
        Assert.assertTrue(result);
    }
}
