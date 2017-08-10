package com.kodilla.good.patterns.airFlights;

import java.time.LocalTime;
import java.util.ArrayList;


public class TimeTable {

    public static ArrayList<ConcreteFlight> getListOfFlights(){
        ArrayList<ConcreteFlight> listOfFlights = new ArrayList<>();
        Flight flight1 = new Flight("Gdańsk","Wrocław");
        Flight flight2 = new Flight("Wrocław","Gdańsk");
        Flight flight3 = new Flight("Gdańsk","Kraków");
        Flight flight4 = new Flight("Kraków","Wrocław");
        LocalTime departureTime1 = LocalTime.of(06, 04 );
        LocalTime departureTime2 = LocalTime.of (07, 12 );
        LocalTime departureTime3 = LocalTime.of (15,15);
        LocalTime departureTime4 = LocalTime.of (18, 04 );
        LocalTime departureTime5= LocalTime.of (21, 12 );
        LocalTime departureTime6 = LocalTime.of (22,15);
        ConcreteFlight concreteFlight1 = new ConcreteFlight(flight1,departureTime1);
        ConcreteFlight concreteFlight2 = new ConcreteFlight(flight1,departureTime2);
        ConcreteFlight concreteFlight3 = new ConcreteFlight(flight1,departureTime3);
        ConcreteFlight concreteFlight4 = new ConcreteFlight(flight1,departureTime4);
        ConcreteFlight concreteFlight5 = new ConcreteFlight(flight1,departureTime5);
        ConcreteFlight concreteFlight6 = new ConcreteFlight(flight1,departureTime6);
        ConcreteFlight concreteFlight7 = new ConcreteFlight(flight2,departureTime1);
        ConcreteFlight concreteFlight8 = new ConcreteFlight(flight2,departureTime2);
        ConcreteFlight concreteFlight9 = new ConcreteFlight(flight2,departureTime3);
        ConcreteFlight concreteFlight10 = new ConcreteFlight(flight2,departureTime4);
        ConcreteFlight concreteFlight11 = new ConcreteFlight(flight2,departureTime5);
        ConcreteFlight concreteFlight12 = new ConcreteFlight(flight2,departureTime6);
        ConcreteFlight concreteFlight13 = new ConcreteFlight(flight3,departureTime1);
        ConcreteFlight concreteFlight14 = new ConcreteFlight(flight3,departureTime2);
        ConcreteFlight concreteFlight15 = new ConcreteFlight(flight3,departureTime3);
        ConcreteFlight concreteFlight16 = new ConcreteFlight(flight3,departureTime4);
        ConcreteFlight concreteFlight17 = new ConcreteFlight(flight3,departureTime5);
        ConcreteFlight concreteFlight18 = new ConcreteFlight(flight3,departureTime6);
        ConcreteFlight concreteFlight19 = new ConcreteFlight(flight4,departureTime1);
        ConcreteFlight concreteFlight20 = new ConcreteFlight(flight4,departureTime2);
        ConcreteFlight concreteFlight21 = new ConcreteFlight(flight4,departureTime3);
        ConcreteFlight concreteFlight22 = new ConcreteFlight(flight4,departureTime4);
        ConcreteFlight concreteFlight23 = new ConcreteFlight(flight4,departureTime5);
        ConcreteFlight concreteFlight24 = new ConcreteFlight(flight4,departureTime6);
        listOfFlights.add(concreteFlight1);
        listOfFlights.add(concreteFlight2);
        listOfFlights.add(concreteFlight3);
        listOfFlights.add(concreteFlight4);
        listOfFlights.add(concreteFlight5);
        listOfFlights.add(concreteFlight6);
        listOfFlights.add(concreteFlight7);
        listOfFlights.add(concreteFlight8);
        listOfFlights.add(concreteFlight9);
        listOfFlights.add(concreteFlight10);
        listOfFlights.add(concreteFlight11);
        listOfFlights.add(concreteFlight12);
        listOfFlights.add(concreteFlight13);
        listOfFlights.add(concreteFlight14);
        listOfFlights.add(concreteFlight15);
        listOfFlights.add(concreteFlight16);
        listOfFlights.add(concreteFlight17);
        listOfFlights.add(concreteFlight18);
        listOfFlights.add(concreteFlight19);
        listOfFlights.add(concreteFlight20);
        listOfFlights.add(concreteFlight21);
        listOfFlights.add(concreteFlight22);
        listOfFlights.add(concreteFlight23);
        listOfFlights.add(concreteFlight24);


        return new ArrayList<>(listOfFlights);
    }
}
