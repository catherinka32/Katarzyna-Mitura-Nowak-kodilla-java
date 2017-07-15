package com.kodilla.testing.shape;

/**
 * Created by Mitura on 2017-07-15.
 */
public class Circle extends Figure implements Shape{
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    String getFigureName() {
        return "Circle";
    }
    double getField() {
        return PI;
    }
}
