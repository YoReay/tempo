package com.yoreay.design.patterns.complex;

/**
 * Created by sanze on 2016/7/25.
 */
public class GooseAdapter implements Quackable {
    Goose goose;

    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
