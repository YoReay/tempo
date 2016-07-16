package com.yoreay.design.patterns.adapter;

/**
 * Created by sanze on 2016/7/16.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
