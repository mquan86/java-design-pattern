package com.mquan86.pattern.behavior.state;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Context {
    private State state;

    public void request() {
        state.handle(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
