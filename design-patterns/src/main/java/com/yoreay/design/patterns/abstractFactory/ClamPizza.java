package com.yoreay.design.patterns.abstractFactory;

/**
 * Created by sanze on 2016/7/13.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory factory;

    public ClamPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        clam = factory.createClam();
    }
}
