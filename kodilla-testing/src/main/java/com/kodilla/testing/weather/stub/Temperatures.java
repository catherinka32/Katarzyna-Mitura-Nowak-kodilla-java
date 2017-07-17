package com.kodilla.testing.weather.stub;

/**
 * Created by Mitura on 2017-07-16.
 */
import java.util.HashMap;

public interface Temperatures {

    //first element of the map is an identifier of weather station
    //second element of the map is a temperature in Celsius degrees

    HashMap<Integer, Double> getTemperatures();
}