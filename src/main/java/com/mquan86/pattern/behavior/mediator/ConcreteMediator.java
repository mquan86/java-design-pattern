package com.mquan86.pattern.behavior.mediator;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ConcreteMediator implements Mediator {
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    @Override
    public void registerColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    @Override
    public void registerColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void actionForColleagueA() {
        // Do something with other colleague...
        colleagueB.notify();
    }

    @Override
    public void actionForColleagueB() {
        // Do something with other colleague...
        colleagueA.notify();
    }
}
