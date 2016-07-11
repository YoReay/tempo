package com.yoreay.design.patterns.observer;

/**
 * Created by sanze on 2016/7/11.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private int temperature;
    private int humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(temperature + "--" + humidity);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
