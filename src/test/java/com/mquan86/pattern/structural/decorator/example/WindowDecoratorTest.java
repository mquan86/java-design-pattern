package com.mquan86.pattern.structural.decorator.example;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class WindowDecoratorTest {

    @Test
    public void testDraw() throws Exception {
        SimpleWindow simpleWindow = mock(SimpleWindow.class);
        WindowWithScrollBar windowWithScrollBar = spy(new WindowWithScrollBar(simpleWindow));
        WindowWithToolBar windowWithToolBar = spy(new WindowWithToolBar(windowWithScrollBar));

        windowWithToolBar.draw();

        verify(simpleWindow, times(1)).draw();
        verify(windowWithScrollBar, times(1)).draw();
        verify(windowWithToolBar, times(1)).draw();
    }
}
