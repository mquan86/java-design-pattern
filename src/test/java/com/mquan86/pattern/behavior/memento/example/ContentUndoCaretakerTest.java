package com.mquan86.pattern.behavior.memento.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContentUndoCaretakerTest {

    @Test
    public void testUndo() throws Exception {
        Editor editor = new Editor();
        editor.setText("Line 1");
        editor.setCurrsorPosition(1);

        ContentUndoCaretaker contentUndoCaretaker = new ContentUndoCaretaker();
        contentUndoCaretaker.addMemento(editor.createUndoMemento());

        editor.setText("Line 2");
        editor.setCurrsorPosition(2);
        contentUndoCaretaker.addMemento(editor.createUndoMemento());

        editor.setText("Line 3");
        editor.setCurrsorPosition(3);

        editor.restoreFromUndoMemento(contentUndoCaretaker.getMemento());
        assertEquals("Line 2", editor.getText());
        assertEquals(2, editor.getCurrsorPosition());

        editor.restoreFromUndoMemento(contentUndoCaretaker.getMemento());
        assertEquals("Line 1", editor.getText());
        assertEquals(1, editor.getCurrsorPosition());
    }
}
