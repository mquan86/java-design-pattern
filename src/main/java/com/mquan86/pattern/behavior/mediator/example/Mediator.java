package com.mquan86.pattern.behavior.mediator.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public interface Mediator {
    public void registerSaveButton(SaveButton saveButton);

    public void registerUndoButton(UndoButton undoButton);

    public void registerRedoButton(RedoButton redoButton);

    public void actionForSave();

    public void actionForUndo();

    public void actionForRedo();
}
