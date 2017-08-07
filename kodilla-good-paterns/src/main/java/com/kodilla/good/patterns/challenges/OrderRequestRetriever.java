package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){

        User user = new User("Klara", "Kulka");
        Product product = new Product("T-shirt");
        int quantity = 98;
        return new OrderRequest(user, product, quantity);
    }
}
