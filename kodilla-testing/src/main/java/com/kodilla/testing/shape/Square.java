package com.kodilla.testing.shape;

/**
 * Created by Mitura on 2017-07-15.
 */
public class Square extends Figure implements Shape{
    public double side;

    public Square(double side) {
        this.side = side;
    }

    String getFigureName() {
        return "Square";
    }
    double getField() {
        return side * side;
    }
}
