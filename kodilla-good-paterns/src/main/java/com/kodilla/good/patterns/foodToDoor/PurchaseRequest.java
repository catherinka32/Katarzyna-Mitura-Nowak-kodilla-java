package com.kodilla.good.patterns.foodToDoor;

public class PurchaseRequest {
    public User user;
    public Producer producer;
    public Product product;
    public int quantity;

    public PurchaseRequest(final User user, final Producer producer, final Product product, final int quantity) {
        this.user = user;
        this.producer = producer;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
