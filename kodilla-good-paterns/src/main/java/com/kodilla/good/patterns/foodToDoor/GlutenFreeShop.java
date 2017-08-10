package com.kodilla.good.patterns.foodToDoor;

public class GlutenFreeShop implements Producer {

    @Override
    public boolean process() {
        System.out.println("We have a problem");
        return false;
    }
}
