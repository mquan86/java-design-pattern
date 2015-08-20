package com.mquan86.pattern.behavior.chain.example;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DocumentConvertChainTest {
    @Spy
    private DocFormatConverter docConverter;

    @Spy
    private PdfFormatConverter pdfConverter;

    @Spy
    private WpsFormatConverter wpsConverter;

    @Mock
    private Document document;

    @Test
    public void testChain() throws Exception {
        docConverter.setNextHandler(pdfConverter);
        pdfConverter.setNextHandler(wpsConverter);
        docConverter.process(document);

        verify(docConverter, times(1)).process(any(Document.class));
        verify(pdfConverter, times(1)).process(any(Document.class));
        verify(wpsConverter, times(1)).process(any(Document.class));
    }
}
