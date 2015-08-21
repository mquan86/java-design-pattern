package com.mquan86.pattern.behavior.command.example;


/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class CopyCommand implements Command {
    private TextEditor receiver;

    public CopyCommand(TextEditor receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.copy();
    }
}
