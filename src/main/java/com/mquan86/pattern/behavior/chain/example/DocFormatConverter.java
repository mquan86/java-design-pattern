package com.mquan86.pattern.behavior.chain.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class DocFormatConverter extends DocumentConvertChain {

    @Override
    public void process(Document document) {
        if (!document.isDocFormat()) {
            // Convert
            document.setDocFormat(true);
        }

        if (getNextHandler() != null) {
            getNextHandler().process(document);
        }
    }
}
