package com.kodilla.testing.shape;

/**
 * Created by Mitura on 2017-07-15.
 */
public class Circle extends Figure implements Shape{
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getFigureName() {
        return "circle";
    }
    public double getField() {
        return Math.PI * radius * radius;
    }
}
