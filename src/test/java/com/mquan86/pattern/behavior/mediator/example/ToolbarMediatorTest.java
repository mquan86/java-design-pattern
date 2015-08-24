package com.mquan86.pattern.behavior.mediator.example;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ToolbarMediatorTest {
    private Mediator mediator = new ToolbarMediator();

    @Spy
    private SaveButton saveButton = new SaveButton(mediator);

    @Spy
    private UndoButton undoButton = new UndoButton(mediator);

    @Spy
    private RedoButton redoButton = new RedoButton(mediator);

    @Before
    public void setupMediator() throws Exception {
        mediator.registerSaveButton(saveButton);
        mediator.registerUndoButton(undoButton);
        mediator.registerRedoButton(redoButton);
    }

    @Test
    public void testSaveButton() throws Exception {
        saveButton.execute();

        verify(undoButton, times(1)).setEnable(false);
        verify(redoButton, times(1)).setEnable(false);
    }

    @Test
    public void testUndoButton() throws Exception {
        undoButton.execute();

        verify(saveButton, times(1)).setEnable(true);
        verify(redoButton, times(1)).setEnable(true);
    }

    @Test
    public void testRedoButton() throws Exception {
        redoButton.execute();

        verify(saveButton, times(1)).setEnable(true);
        verify(undoButton, times(1)).setEnable(true);
    }
}
