package com.kodilla.testing.weather.stub;

/**
 * Created by Mitura on 2017-07-16.
 */

import org.junit.Assert;
import org.junit.Test;

public class WeatherForecastTestSuite {
        @Test
    public void testCalculateForecastWithStub(){
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assert.assertEquals(5, quantityOfSensors);
    }
}