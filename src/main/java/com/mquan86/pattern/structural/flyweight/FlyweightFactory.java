package com.mquan86.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getFlyWeight(String key) {
        Flyweight flyWeight = flyweights.get(key);
        if (flyWeight == null) {
            flyWeight = new ConcreteFlyweight(key);
            flyweights.put(key, flyWeight);
        }
        return flyWeight;
    }
}
