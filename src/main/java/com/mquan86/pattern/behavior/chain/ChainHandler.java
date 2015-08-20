package com.mquan86.pattern.behavior.chain;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public abstract class ChainHandler {
    private ChainHandler nextHandler;

    public abstract void process(Object obj);

    public void setNextHandler(ChainHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public ChainHandler getNextHandler() {
        return nextHandler;
    }
}
