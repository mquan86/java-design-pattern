package com.mquan86.pattern.behavior.mediator;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ConcreteColleagueB implements Colleague {
    private Mediator mediator;

    public ConcreteColleagueB(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.actionForColleagueB();
    }
}
