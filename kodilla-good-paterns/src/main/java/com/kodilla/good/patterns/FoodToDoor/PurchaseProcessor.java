package com.kodilla.good.patterns.FoodToDoor;

public class PurchaseProcessor {


    public PurchaseDto mainProcess(final PurchaseRequest purchaseRequest) {
        boolean isPurchased = purchaseRequest.getProducer().process();
        if (isPurchased) {
            System.out.println("I'm sending e-mail to the " + purchaseRequest.getUser().getName()+ purchaseRequest.getUser().getSurname());
            return new PurchaseDto(purchaseRequest.getUser(), true);
        } else {
            System.out.println("Sorry, purchase is not possible now");
            return new PurchaseDto(purchaseRequest.getUser(), false);
        }
    }
}