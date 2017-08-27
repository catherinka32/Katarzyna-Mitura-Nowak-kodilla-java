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
        Assert.assertFalse(drivingTask.isTaskExecuted());
        System.out.println("Name of task: " + drivingTask.getTaskName());
        System.out.println(drivingTask.executeTask());
        System.out.println("Task is executed:" + drivingTask.isTaskExecuted());
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
        Assert.assertFalse(paintingTask.isTaskExecuted());
        System.out.println("Name of task: " + paintingTask.getTaskName());
        System.out.println(paintingTask.executeTask());
        System.out.println("Task is executed:" + paintingTask.isTaskExecuted());
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
        Assert.assertFalse(shoppingTask.isTaskExecuted());
        System.out.println("Name of task: " + shoppingTask.getTaskName());
        System.out.println(shoppingTask.executeTask());
        System.out.println("Task is executed:" + shoppingTask.isTaskExecuted());

    }
}
