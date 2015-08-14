package com.mquan86.pattern.structural.bridge.example;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ButtonGuiDrawingTest {
    @Mock
    private WindowsButton windowsButton;

    @Mock
    private LinuxButton linuxButton;


    @Test
    public void testDraw() throws Exception {
        AbstractButtonDrawing buttonDrawing1 = new ButtonGuiDrawing(windowsButton);
        buttonDrawing1.draw();
        verify(windowsButton).create();

        AbstractButtonDrawing buttonDrawing2 = new ButtonGuiDrawing(linuxButton);
        buttonDrawing2.draw();
        verify(linuxButton).create();
    }

}
