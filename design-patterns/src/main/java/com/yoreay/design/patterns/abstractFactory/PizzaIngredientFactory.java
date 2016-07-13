package com.yoreay.design.patterns.abstractFactory;

/**
 * Created by sanze on 2016/7/13.
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
