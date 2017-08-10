package com.kodilla.good.patterns.foodToDoor;

public  class PurchaseRequestRetriever {
public PurchaseRequest retrieve() {
    User user = new User ("Kate", "Fantastic");
    Producer producer = new GlutenFreeShop();
    Product product = new Product("Gluten free ice-cream");
    int quantity = 189;

    return new PurchaseRequest(user, producer, product, quantity);
    }
}
