package com.yoreay.design.patterns.decorator;

/**
 * Created by sanze on 2016/7/12.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .1 + beverage.cost();
    }
}
