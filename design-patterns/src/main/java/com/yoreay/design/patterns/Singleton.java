package com.yoreay.design.patterns;

/**
 * Created by sanze on 2016/7/14.
 */
public class Singleton {

    //懒实例化，简单，线程不安全
    //可以为getInstance 方法加上synchronized关键字，使方法成为线程安全的，不过这种方法大大地降低性能
//    private static Singleton instance;
//
//    private Singleton() {
//
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //类加载时实例化，线程安全
//    private static Singleton instance = new Singleton();
//
//    private Singleton() {
//
//    }
//
//    public static Singleton getInstance() {
//        return instance;
//    }
    //双重检查加锁
//    private volatile static Singleton instance;
//
//    private Singleton() {
//
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

    //枚举方式实现单件模式
    enum EnumSingleton {
        INSTANCE;

        private EnumSingleton() {

        }
    }
}
