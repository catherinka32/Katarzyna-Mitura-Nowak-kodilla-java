package com.kodilla.good.patterns.airFlightsPrim;

public class Flight {
    private String DeparturePlace;
    private String ArrivalPlace;
    private String numberOfFlight;

    public Flight(String departurePlace, String arrivalPlace, String numberOfFlight) {
        DeparturePlace = departurePlace;
        ArrivalPlace = arrivalPlace;
        this.numberOfFlight = numberOfFlight;
    }

    public String getDeparturePlace() {
        return DeparturePlace;
    }

    public String getArrivalPlace() {
        return ArrivalPlace;
    }

    public String getNumberOfFlight() {
        return numberOfFlight;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "DeparturePlace='" + DeparturePlace + '\'' +
                ", ArrivalPlace='" + ArrivalPlace + '\'' +
                ", numberOfFlight='" + numberOfFlight + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!DeparturePlace.equals(flight.DeparturePlace)) return false;
        if (!ArrivalPlace.equals(flight.ArrivalPlace)) return false;
        return numberOfFlight.equals(flight.numberOfFlight);
    }

    @Override
    public int hashCode() {
        int result = DeparturePlace.hashCode();
        result = 31 * result + ArrivalPlace.hashCode();
        result = 31 * result + numberOfFlight.hashCode();
        return result;
    }
}
