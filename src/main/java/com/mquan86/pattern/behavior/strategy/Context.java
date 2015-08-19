package com.mquan86.pattern.behavior.strategy;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void request() {
        strategy.execute();
    }
}
