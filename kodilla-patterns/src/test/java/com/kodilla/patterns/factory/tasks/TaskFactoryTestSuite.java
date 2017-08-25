package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Driving people", drivingTask.getTaskName());
        Assert.assertEquals("DrivingTask is in progress", drivingTask.executeTask());
        System.out.println("Name of task: " + drivingTask.getTaskName());
        System.out.println(drivingTask.executeTask());
    }
    @Test
    public void testFactoryPainting(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting", paintingTask.getTaskName());
        Assert.assertEquals("PaintingTask is in progress", paintingTask.executeTask());

    }
    @Test
    public void testFactoryShopping(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping", shoppingTask.getTaskName());
        Assert.assertEquals("ShoppingTask is in progress", shoppingTask.executeTask());
    }
}
