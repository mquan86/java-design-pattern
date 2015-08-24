package com.mquan86.pattern.behavior.mediator.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class RedoButton implements Button {
    private Mediator mediator;

    public RedoButton(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.actionForRedo();
    }

    @Override
    public void setEnable(boolean enable) {}
}
