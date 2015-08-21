package com.mquan86.pattern.behavior.command;


/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {}
}
