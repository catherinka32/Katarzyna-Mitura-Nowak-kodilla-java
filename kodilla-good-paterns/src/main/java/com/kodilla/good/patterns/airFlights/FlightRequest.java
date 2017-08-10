package com.kodilla.good.patterns.airFlights;

public class FlightRequest {
    Flight flight;

    public FlightRequest(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }
}
