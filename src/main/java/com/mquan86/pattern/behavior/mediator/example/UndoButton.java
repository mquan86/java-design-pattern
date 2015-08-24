package com.mquan86.pattern.behavior.mediator.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class UndoButton implements Button {
    private Mediator mediator;

    public UndoButton(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.actionForUndo();
    }

    @Override
    public void setEnable(boolean enable) {}
}
