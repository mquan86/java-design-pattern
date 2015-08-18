package com.mquan86.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class FlyWeightFactory {
    private Map<String, FlyWeight> flyWeights = new HashMap<String, FlyWeight>();

    public FlyWeight getFlyWeight(String key) {
        FlyWeight flyWeight = flyWeights.get(key);
        if (flyWeight == null) {
            flyWeight = new ConcreteFlyWeight(key);
            flyWeights.put(key, flyWeight);
        }
        return flyWeight;
    }
}
