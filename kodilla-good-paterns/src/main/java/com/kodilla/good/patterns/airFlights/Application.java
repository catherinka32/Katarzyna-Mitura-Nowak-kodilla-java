package com.kodilla.good.patterns.airFlights;
public class Application {
    public static void main(String args[]){
        FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
        FlightRequest flightRequest = flightRequestRetriever.retrieve();
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlight(flightRequest);
        /*TimeTable timeTable = new TimeTable();
        timeTable.getListOfFlights().stream()
                .filter(s-> s.getFlight().getPlaceOfDeparture() == "Wrocław")
                .forEach(System.out::println);
        timeTable.getListOfFlights().stream()
                .filter(s-> s.getFlight().getPlaceOfArrival() == "Wrocław")
                .forEach(System.out::println);*/
    }
}
