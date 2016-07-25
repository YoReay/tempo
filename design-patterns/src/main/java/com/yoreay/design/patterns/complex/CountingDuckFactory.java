package com.yoreay.design.patterns.complex;

/**
 * Created by sanze on 2016/7/25.
 */
public class CountingDuckFactory extends AbstractDuctFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
