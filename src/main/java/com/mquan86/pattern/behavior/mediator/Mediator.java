package com.mquan86.pattern.behavior.mediator;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public interface Mediator {
    public void registerColleagueA(ConcreteColleagueA colleagueA);

    public void registerColleagueB(ConcreteColleagueB colleagueB);

    public void actionForColleagueA();

    public void actionForColleagueB();
}
