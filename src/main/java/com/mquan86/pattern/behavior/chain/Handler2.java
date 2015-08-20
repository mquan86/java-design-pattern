package com.mquan86.pattern.behavior.chain;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Handler2 extends ChainHandler {

    @Override
    public void process(Object obj) {
        // Do action here then.
        // Then put it to the next chain.
        if (getNextHandler() != null) {
            getNextHandler().process(obj);
        }
    }
}
