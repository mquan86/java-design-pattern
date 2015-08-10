package com.mquan86.pattern.creational.singleton;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class SingletonEager {
    private static final SingletonEager singleton = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return singleton;
    }
}
