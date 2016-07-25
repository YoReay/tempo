package com.yoreay.design.patterns.complex;

/**
 * Created by sanze on 2016/7/25.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
