package com.yoreay.design.patterns.composite;

/**
 * Created by sanze on 2016/7/18.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
