package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING ="SHOPPING";
    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case DRIVING:
                return new DrivingTask("Driving people", "All over the world", "pram");
            case PAINTING:
                return new PaintingTask("Painting", "purple", "walls");
            case SHOPPING:
                return new ShoppingTask("Shopping", "salt", 2.50);
            default:
                return null;
        }
    }
}
