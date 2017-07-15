package com.kodilla.testing.shape;

/**
 * Created by Mitura on 2017-07-15.
 */
public class Triangle extends Figure iplements Shape {
    public double base;
    public double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    String getFigureName() {
        return "Triangle";
    }
    double getField(){
        return 0.5 * base * height;
    }
}
