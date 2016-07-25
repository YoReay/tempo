package com.yoreay.design.patterns.complex;

/**
 * Created by sanze on 2016/7/25.
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuctFactory ductFactory = new CountingDuckFactory();

        simulator.simulate(ductFactory);
    }

    void simulate(AbstractDuctFactory ductFactory) {
        Quackable redheadDuck = ductFactory.createRedheadDuck();
        Quackable duckCall = ductFactory.createDuckCall();
        Quackable rubberDuck = ductFactory.createRubberDuck();
        Quackable gooseDuck = ductFactory.createGoose();
        System.out.println("\nDuck Simulator: With Composite - Flocks");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = ductFactory.createMallardDuck();
        Quackable mallardTwo = ductFactory.createMallardDuck();
        Quackable mallardThree = ductFactory.createMallardDuck();
        Quackable mallardFour = ductFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);
        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
