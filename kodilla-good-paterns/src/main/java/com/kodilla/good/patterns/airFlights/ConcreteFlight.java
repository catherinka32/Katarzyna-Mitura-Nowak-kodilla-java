package com.kodilla.good.patterns.airFlights;

import java.time.LocalTime;

public class ConcreteFlight {
    public Flight flight;
    public LocalTime departureTime;

    public ConcreteFlight(Flight flight, LocalTime departureTime) {
        this.flight = flight;
        this.departureTime = departureTime;
    }

    public Flight getFlight() {
        return flight;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConcreteFlight that = (ConcreteFlight) o;

        if (!flight.equals(that.flight)) return false;
        return departureTime.equals(that.departureTime);
    }

    @Override
    public int hashCode() {
        int result = flight.hashCode();
        result = 31 * result + departureTime.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ConcreteFlight{" +
                "flight=" + flight +
                ", departureTime=" + departureTime +
                '}';
    }
}