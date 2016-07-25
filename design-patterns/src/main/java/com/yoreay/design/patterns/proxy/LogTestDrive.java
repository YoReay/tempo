package com.yoreay.design.patterns.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by sanze on 2016/7/22.
 */
public class LogTestDrive {
    public static void main(String[] args) {
        Logable logable = (Logable) Proxy.newProxyInstance(Log.class.getClassLoader(), new Class[]{Logable.class}, new LogProxy(new Log()));
//        logable.log();
//        System.out.println("-----");
        System.out.println(logable);
    }
}
