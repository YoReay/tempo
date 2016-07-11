package com.yoreay.design.patterns.strategy;

/**
 * Created by sanze on 2016/7/11.
 */
public abstract class Duck {

    /**
     * The Fly behavior.
     */
    FlyBehavior flyBehavior;

    /**
     * The Quack behavior.
     */
    QuackBehavior quackBehavior;

    /**
     * Sets fly behavior.
     *
     * @param flyBehavior the fly behavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * Sets quack behavior.
     *
     * @param quackBehavior the quack behavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * Display.
     */
    abstract void display();

    /**
     * Fly.
     */
    void fly() {
        flyBehavior.fly();
    }

    /**
     * Quack.
     */
    void quack() {
        quackBehavior.quack();
    }
}
