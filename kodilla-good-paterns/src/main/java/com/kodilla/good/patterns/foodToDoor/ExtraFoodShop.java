package com.kodilla.good.patterns.foodToDoor;

public class ExtraFoodShop implements Producer {

    @Override
    public boolean process() {
        System.out.println("What's going on");
        return false;
    }
}
