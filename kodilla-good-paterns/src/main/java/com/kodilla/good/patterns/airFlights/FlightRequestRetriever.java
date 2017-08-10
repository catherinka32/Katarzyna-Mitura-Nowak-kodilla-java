package com.kodilla.good.patterns.airFlights;

public class FlightRequestRetriever {
    public FlightRequest retrieve(){
        Flight flight = new Flight("Wrocław", "Gdańsk");
        return new FlightRequest(flight);
    }
}
