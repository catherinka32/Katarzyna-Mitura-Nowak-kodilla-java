package com.kodilla.good.patterns.foodToDoor;

public class HealthyShop implements Producer {

    @Override
    public boolean process() {
        System.out.println("What I'm doing here");
        return false;
    }
}
