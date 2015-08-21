package com.mquan86.pattern.behavior.command.example;


/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class PasteCommand implements Command {
    private TextEditor receiver;

    public PasteCommand(TextEditor receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.paste();
    }
}
