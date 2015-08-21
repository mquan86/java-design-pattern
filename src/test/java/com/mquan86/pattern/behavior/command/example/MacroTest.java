package com.mquan86.pattern.behavior.command.example;

import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MacroTest {
    @Mock
    private TextEditor textEditor;

    @Test
    public void testExecuteMacro() throws Exception {
        Command cutCommand = new CutCommand(textEditor);
        Command copyCommand = new CopyCommand(textEditor);
        Command pasteCommand = new PasteCommand(textEditor);

        Macro macro = new Macro();
        macro.addCommand(cutCommand);
        macro.addCommand(copyCommand);
        macro.addCommand(pasteCommand);
        macro.executeMacro();

        verify(textEditor, timeout(1)).cut();
        verify(textEditor, timeout(1)).copy();
        verify(textEditor, timeout(1)).paste();
    }
}
