package com.yoreay.design.patterns.decorator;

/**
 * Created by sanze on 2016/7/12.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
