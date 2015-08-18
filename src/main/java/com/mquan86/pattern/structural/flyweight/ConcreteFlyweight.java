package com.mquan86.pattern.structural.flyweight;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ConcreteFlyweight implements Flyweight {
    private String state;

    public ConcreteFlyweight(String state) {
        this.state = state;
    }

    @Override
    public void operation() {}

    public String getState() {
        return state;
    }
}
