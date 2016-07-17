package com.yoreay.design.patterns.templateMethod;

/**
 * Created by sanze on 2016/7/17.
 */
public class Main {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
