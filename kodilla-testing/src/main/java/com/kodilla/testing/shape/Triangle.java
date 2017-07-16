package com.kodilla.testing.shape;

/**
 * Created by Mitura on 2017-07-15.
 */
public class Triangle extends Figure implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public String getFigureName() {
        return "Triangle";
    }
    public double getField(){
        return 0.5 * base * height;
    }
}
