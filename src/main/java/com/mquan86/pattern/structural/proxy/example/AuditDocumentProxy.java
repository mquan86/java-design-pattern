package com.mquan86.pattern.structural.proxy.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class AuditDocumentProxy implements Document {
    private Document document;

    public AuditDocumentProxy(Document document) {
        this.document = document;
    }

    @Override
    public void delete() {
        auditDelete();
        document.delete();
    }

    protected void auditDelete() {
        // Do audit here
    }
}
