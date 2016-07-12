package com.yoreay.design.patterns.decorator;

/**
 * Created by sanze on 2016/7/12.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
