package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightMap = new HashMap<>();

        flightMap.put("Newcastle", false);
        flightMap.put("Milano", true);
        flightMap.put("Malpensa", false);
        flightMap.put("Oslo", true);
        flightMap.put("Bergamo", true);
        boolean found = false;
        for (Map.Entry<String, Boolean> entry : flightMap.entrySet()) {
            if (entry.getKey() == flight.getDepartureAirport()) {
                found = true;
                if (entry.getValue()) {
                    System.out.println("Prepare money for a ticket :)");
                } else {
                    System.out.println("Sorry, this destination is not available");
                    }
                }
            }
        if (found == false) {
            throw new RouteNotFoundException();
        }
    }
}

