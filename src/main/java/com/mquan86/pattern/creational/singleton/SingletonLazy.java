package com.mquan86.pattern.creational.singleton;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class SingletonLazy {
    private SingletonLazy() {}

    private static class SingletonHolder {
        private static final SingletonLazy singleton = new SingletonLazy();
    }

    public static SingletonLazy getInstance() {
        return SingletonHolder.singleton;
    }
}
