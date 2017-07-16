package com.kodilla.testing.shape;

/**
 * Created by Mitura on 2017-07-15.
 */
public class Square extends Figure implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public String getFigureName() {
        return "square";
    }
    public double getField() {
        return side * side;
    }
}
