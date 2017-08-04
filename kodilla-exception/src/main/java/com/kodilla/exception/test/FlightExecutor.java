package com.kodilla.exception.test;

public class FlightExecutor {
    public static void main(String args[]){
        FlightSearcher flightSearcher = new FlightSearcher();
        Flight flight1 = new Flight("Oslo");
        flightSearcher.findFlight(flight1);
    }
}
