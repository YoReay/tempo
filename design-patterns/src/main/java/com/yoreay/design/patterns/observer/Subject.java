package com.yoreay.design.patterns.observer;

/**
 * Created by sanze on 2016/7/11.
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
