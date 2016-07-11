package com.yoreay.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanze on 2016/7/11.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;

    private int temperature;

    private int humidity;

    private int pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        if (o != null) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if (o != null) {
            int i = observers.indexOf(o);
            if (i >= 0) {
                observers.remove(i);
            }
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
