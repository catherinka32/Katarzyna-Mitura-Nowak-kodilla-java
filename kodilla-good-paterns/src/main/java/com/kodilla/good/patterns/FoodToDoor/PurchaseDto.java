package com.kodilla.good.patterns.FoodToDoor;

public class PurchaseDto {
    User user;
    boolean isPurchased;

    public PurchaseDto(User user, boolean isPurchased) {
        this.user = user;
        this.isPurchased = isPurchased;
    }

    public User getUser() {
        return user;
    }

    public boolean getIsPurchased() {
        return isPurchased;
    }
}
