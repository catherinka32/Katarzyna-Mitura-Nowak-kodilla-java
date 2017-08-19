package com.kodilla.exception.test;

public class FlightExecutor {
    public static void main(String args[]){
        FlightSearcher flightSearcher = new FlightSearcher();
        Flight flight1 = new Flight("Malpensa" );
        try{
            flightSearcher.findFlight(flight1);
        }catch(Exception e){
            System.out.println("Destination not found in the map");
        }
    }
}
