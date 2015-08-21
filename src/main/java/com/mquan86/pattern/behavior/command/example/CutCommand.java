package com.mquan86.pattern.behavior.command.example;


/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class CutCommand implements Command {
    private TextEditor receiver;

    public CutCommand(TextEditor receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.cut();
    }
}
