package com.yoreay.design.patterns.abstractFactory;

/**
 * Created by sanze on 2016/7/13.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(factory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
        }
        return pizza;
    }
}
