package com.yoreay.design.patterns.abstractFactory;

/**
 * Created by sanze on 2016/7/13.
 */
public class Main {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}
