package com.kodilla.good.patterns.airFlights;

import java.time.LocalTime;

public class Flight {
    public String placeOfDeparture;
    public String placeOfArrival;

    public Flight(String placeOfDeparture, String placeOfArrival) {
        this.placeOfDeparture = placeOfDeparture;
        this.placeOfArrival = placeOfArrival;
    }

    public String getPlaceOfDeparture() {
        return placeOfDeparture;
    }

    public String getPlaceOfArrival() {
        return placeOfArrival;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "placeOfDeparture='" + placeOfDeparture + '\'' +
                ", placeOfArrival='" + placeOfArrival + '\'' +
                '}';
    }
}
