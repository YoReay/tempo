package com.yoreay.design.patterns.strategy;

/**
 * Created by sanze on 2016/7/11.
 */
public class ModelDuck extends Duck {

    /**
     * Instantiates a new Model duck.
     */
    public ModelDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    /**
     * Instantiates a new Model duck.
     *
     * @param flyBehavior   the fly behavior
     * @param quackBehavior the quack behavior
     */
    public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    void display() {
        System.out.println("I'm a model duck");
    }
}
