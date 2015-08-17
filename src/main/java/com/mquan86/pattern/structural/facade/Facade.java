package com.mquan86.pattern.structural.facade;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Facade {
    private SubFunction1 sub1;
    private SubFunction2 sub2;
    private SubFunction3 sub3;

    public Facade() {
        sub1 = new SubFunction1();
        sub2 = new SubFunction2();
        sub3 = new SubFunction3();
    }

    public void doFunction() {
        sub1.function1();
        sub2.function2();
        sub3.function3();
    }
}
