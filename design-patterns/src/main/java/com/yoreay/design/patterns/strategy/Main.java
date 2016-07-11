package com.yoreay.design.patterns.strategy;

/**
 * Created by sanze on 2016/7/11.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.display();
        duck.fly();
        duck.quack();

        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new Squeak());

        duck.fly();
        duck.quack();
    }
}
