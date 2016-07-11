package com.yoreay.design.patterns.strategy;

/**
 * Created by sanze on 2016/7/11.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly.");
    }
}
