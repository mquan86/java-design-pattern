package com.mquan86.pattern.behavior.chain.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public abstract class DocumentConvertChain {
    private DocumentConvertChain nextHandler;

    public abstract void process(Document document);

    public void setNextHandler(DocumentConvertChain nextHandler) {
        this.nextHandler = nextHandler;
    }

    public DocumentConvertChain getNextHandler() {
        return nextHandler;
    }
}
