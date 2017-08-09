package com.kodilla.good.patterns.FoodToDoor;

public class GlutenFreeShop implements Producer{

    @Override
    public boolean process(){
        System.out.println("We have a problem");
        return false;
    }
}
