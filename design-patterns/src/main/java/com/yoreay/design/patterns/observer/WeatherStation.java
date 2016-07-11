package com.yoreay.design.patterns.observer;

/**
 * Created by sanze on 2016/7/11.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(1, 2, 3);
        weatherData.setMeasurements(4, 5, 6);
        weatherData.setMeasurements(7, 8, 9);
    }
}
