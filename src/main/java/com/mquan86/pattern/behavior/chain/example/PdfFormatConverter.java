package com.mquan86.pattern.behavior.chain.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class PdfFormatConverter extends DocumentConvertChain {

    @Override
    public void process(Document document) {
        if (!document.isPdfFormat()) {
            // Convert
            document.setPdfFormat(true);
        }

        if (getNextHandler() != null) {
            getNextHandler().process(document);
        }
    }
}
