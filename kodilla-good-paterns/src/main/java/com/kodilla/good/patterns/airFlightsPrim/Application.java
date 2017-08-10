package com.kodilla.good.patterns.airFlightsPrim;

public class Application {
    public static void main(String args[]) {

        TimeTable timeTable = new TimeTable();
        System.out.println("Requested departure place");
        timeTable.getListOfFlights().stream()
                .filter(s -> s.getDeparturePlace().equals("Wrocław"))
                .forEach(System.out::println);
        System.out.println("Requested arrival place");
        timeTable.getListOfFlights().stream()
                .filter(s -> s.getArrivalPlace().equals("Wrocław"))
                .forEach(System.out::println);
        System.out.println("Inerconnection");
        timeTable.getListOfFlights().stream()
                .filter(s -> s.getDeparturePlace().equals("Gdańsk"))
                .filter(s -> s.getArrivalPlace().equals("Kraków"))
                .forEach(System.out::println);
        timeTable.getListOfFlights().stream()
                .filter(s -> s.getDeparturePlace().equals("Kraków"))
                .filter(s -> s.getArrivalPlace().equals("Wrocław"))
                .forEach(System.out::println);
    }
}
