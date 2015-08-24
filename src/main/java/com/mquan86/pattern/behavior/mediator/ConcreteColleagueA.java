package com.mquan86.pattern.behavior.mediator;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ConcreteColleagueA implements Colleague {
    private Mediator mediator;

    public ConcreteColleagueA(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.actionForColleagueA();
    }
}
