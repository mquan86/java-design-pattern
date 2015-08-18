package com.mquan86.pattern.structural.proxy.example;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AuditDocumentProxyTest {
    @Mock
    private Document document;

    @Test
    public void testDelete() throws Exception {
        AuditDocumentProxy proxy = spy(new AuditDocumentProxy(document));

        proxy.delete();

        verify(proxy, times(1)).auditDelete();
        verify(document, times(1)).delete();
    }
}
