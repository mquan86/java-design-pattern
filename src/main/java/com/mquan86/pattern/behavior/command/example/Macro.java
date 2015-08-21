package com.mquan86.pattern.behavior.command.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Macro {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeMacro() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
