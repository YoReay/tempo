package com.yoreay.design.patterns.templateMethod;

/**
 * Created by sanze on 2016/7/17.
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    final void boilWater() {
        System.out.println("Boiling water");
    }

    abstract void brew();

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();
}
