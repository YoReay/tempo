package com.yoreay.design.patterns.complex;

/**
 * Created by sanze on 2016/7/25.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
