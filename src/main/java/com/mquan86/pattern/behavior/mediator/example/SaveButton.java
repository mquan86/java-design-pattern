package com.mquan86.pattern.behavior.mediator.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class SaveButton implements Button {
    private Mediator mediator;

    public SaveButton(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.actionForSave();
    }

    @Override
    public void setEnable(boolean enable) {}
}
