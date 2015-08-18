package com.mquan86.pattern.structural.flyweight;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ConcreteFlyWeight implements FlyWeight {
    private String state;

    public ConcreteFlyWeight(String state) {
        this.state = state;
    }

    @Override
    public void operation() {}

    public String getState() {
        return state;
    }
}
