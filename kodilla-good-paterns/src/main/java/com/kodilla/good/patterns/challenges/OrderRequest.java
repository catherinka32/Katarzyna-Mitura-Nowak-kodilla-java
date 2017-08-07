package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    public User user;
    public Product product;
    public int quantity;

    public OrderRequest(final User user,final Product product,final int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
