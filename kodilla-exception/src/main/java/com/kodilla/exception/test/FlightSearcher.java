package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    public void findFlight(Flight flight){
        HashMap<String, Boolean> flightMap = new HashMap<>();

        flightMap.put("Newcastle",false);
        flightMap.put("Milano",true);
        flightMap.put("Malpensa",false);
        flightMap.put("Oslo",true);
        flightMap.put("Bergamo",true);

        for(Map.Entry<String,Boolean>)entry : flightMap.entrySet()) {
            if(entry.getKey()= flight.getDepartureAirport() && entry.getValue() = true){
                System.out.println("Prepare money for a ticket :)");
            }else{
                System.out.println("Sorry, this destination is not available");
            }
        }
    }
}
