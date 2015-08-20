package com.mquan86.pattern.behavior.chain.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Document {
    private boolean isDocFormat;
    private boolean isPdfFormat;
    private boolean isWpsFormat;

    public boolean isDocFormat() {
        return isDocFormat;
    }

    public void setDocFormat(boolean isDocFormat) {
        this.isDocFormat = isDocFormat;
    }

    public boolean isPdfFormat() {
        return isPdfFormat;
    }

    public void setPdfFormat(boolean isPdfFormat) {
        this.isPdfFormat = isPdfFormat;
    }

    public boolean isWpsFormat() {
        return isWpsFormat;
    }

    public void setWpsFormat(boolean isWpsFormat) {
        this.isWpsFormat = isWpsFormat;
    }
}
