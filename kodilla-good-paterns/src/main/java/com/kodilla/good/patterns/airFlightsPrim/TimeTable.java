package com.kodilla.good.patterns.airFlightsPrim;

import java.util.ArrayList;

public class TimeTable {
    public static ArrayList<Flight> getListOfFlights(){
    ArrayList<Flight> listOfFlights = new ArrayList<>();
    Flight flight1 = new Flight("Gdańsk","Wrocław","GW98783");
    Flight flight2 = new Flight("Gdańsk","Wrocław","GW92243");
    Flight flight3 = new Flight("Gdańsk","Wrocław","GW90043");
    Flight flight4 = new Flight("Wrocław","Gdańsk","WG08432");
    Flight flight5 = new Flight("Wrocław","Gdańsk","WG12432");
    Flight flight6 = new Flight("Wrocław","Gdańsk","WG24432");
    Flight flight7 = new Flight("Gdańsk","Kraków","GK032854");
    Flight flight8 = new Flight("Gdańsk","Kraków","GK031254");
    Flight flight9 = new Flight("Gdańsk","Kraków","GK031754");
    Flight flight10 = new Flight("Kraków","Wrocław","KW984234");
    Flight flight11 = new Flight("Kraków","Wrocław","KW984234");
    Flight flight12 = new Flight("Kraków","Wrocław","KW984234");

    listOfFlights.add(flight1);
    listOfFlights.add(flight2);
    listOfFlights.add(flight3);
    listOfFlights.add(flight4);
    listOfFlights.add(flight5);
    listOfFlights.add(flight6);
    listOfFlights.add(flight7);
    listOfFlights.add(flight8);
    listOfFlights.add(flight9);
    listOfFlights.add(flight10);
    listOfFlights.add(flight11);
    listOfFlights.add(flight12);


    return new ArrayList<>(listOfFlights);
    }
}

