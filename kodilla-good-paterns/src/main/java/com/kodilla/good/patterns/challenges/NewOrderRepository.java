package com.kodilla.good.patterns.challenges;

public class NewOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder (User user, Product product, int quantity){
        return true;
    }
}
