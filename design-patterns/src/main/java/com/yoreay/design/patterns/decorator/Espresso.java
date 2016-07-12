package com.yoreay.design.patterns.decorator;

/**
 * Created by sanze on 2016/7/12.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
