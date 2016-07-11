package com.yoreay.design.patterns.strategy;

/**
 * Created by sanze on 2016/7/11.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("gua gua gua");
    }
}
