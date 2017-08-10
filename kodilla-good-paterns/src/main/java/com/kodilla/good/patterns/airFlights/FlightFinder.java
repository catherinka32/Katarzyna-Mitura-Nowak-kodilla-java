package com.kodilla.good.patterns.airFlights;

public class FlightFinder {
    public void findFlight(FlightRequest flightRequest) {
        TimeTable timeTable = new TimeTable();
        System.out.println("Departures from requested place");
        timeTable.getListOfFlights().stream()
                .filter(s -> s.getFlight().getPlaceOfDeparture() == flightRequest.getFlight().getPlaceOfDeparture())
                .forEach(System.out::println);
        System.out.println("Arrival to requested place");
        timeTable.getListOfFlights().stream()
                .filter(s -> s.getFlight().getPlaceOfArrival() == flightRequest.getFlight().getPlaceOfArrival())
                .forEach(System.out::println);
        timeTable.getListOfFlights().stream()
                .
    }
}