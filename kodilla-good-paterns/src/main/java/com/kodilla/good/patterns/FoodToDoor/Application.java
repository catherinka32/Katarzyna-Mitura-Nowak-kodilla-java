package com.kodilla.good.patterns.FoodToDoor;

public class Application {
    public static void main (String args[]) {
        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();

        PurchaseProcessor purchaseProcessor = new PurchaseProcessor();
        purchaseProcessor.mainProcess(purchaseRequest);
    }
}

