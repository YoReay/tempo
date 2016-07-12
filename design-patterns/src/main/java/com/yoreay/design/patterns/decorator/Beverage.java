package com.yoreay.design.patterns.decorator;

/**
 * Created by sanze on 2016/7/12.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
