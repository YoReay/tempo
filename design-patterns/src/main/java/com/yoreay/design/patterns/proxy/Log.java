package com.yoreay.design.patterns.proxy;

/**
 * Created by sanze on 2016/7/22.
 */
public class Log implements Logable {
    @Override
    public void log() {
        System.out.println("Log start...");
    }
}
