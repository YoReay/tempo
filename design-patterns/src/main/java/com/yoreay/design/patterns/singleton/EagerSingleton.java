package com.yoreay.design.patterns.singleton;

/**
 * Created by sanze on 2016/10/26.
 */
public class EagerSingleton {
    public static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
