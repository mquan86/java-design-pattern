package com.mquan86.pattern.behavior.mediator.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ToolbarMediator implements Mediator {
    private SaveButton saveButton;
    private UndoButton undoButton;
    private RedoButton redoButton;

    @Override
    public void registerSaveButton(SaveButton saveButton) {
        this.saveButton = saveButton;
    }

    @Override
    public void registerUndoButton(UndoButton undoButton) {
        this.undoButton = undoButton;
    }

    @Override
    public void registerRedoButton(RedoButton redoButton) {
        this.redoButton = redoButton;
    }

    @Override
    public void actionForSave() {
        undoButton.setEnable(false);
        redoButton.setEnable(false);
    }

    @Override
    public void actionForRedo() {
        undoButton.setEnable(true);
        saveButton.setEnable(true);
    }

    @Override
    public void actionForUndo() {
        redoButton.setEnable(true);
        saveButton.setEnable(true);
    }
}
