package com.mquan86.pattern.behavior.chain.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class WpsFormatConverter extends DocumentConvertChain {

    @Override
    public void process(Document document) {
        if (!document.isWpsFormat()) {
            // Convert
            document.setWpsFormat(true);
        }

        if (getNextHandler() != null) {
            getNextHandler().process(document);
        }
    }
}
