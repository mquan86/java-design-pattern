package com.mquan86.pattern.behavior.command;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Client {
    public void useCommand() {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
