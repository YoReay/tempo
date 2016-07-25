package com.yoreay.design.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by sanze on 2016/7/22.
 */
public class LogProxy implements InvocationHandler {
    Logable log;

    public LogProxy(Logable log) {
        this.log = log;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始...");
        Object o = method.invoke(log, args);
        System.out.println("代理结束...");
        return o;
    }
}
