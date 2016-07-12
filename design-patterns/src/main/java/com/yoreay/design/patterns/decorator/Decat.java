package com.yoreay.design.patterns.decorator;

/**
 * Created by sanze on 2016/7/12.
 */
public class Decat extends Beverage {
    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
