package com.mquan86.pattern.behavior.command;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
