package com.mquan86.pattern.behavior.observer.example;


import static org.mockito.Mockito.never;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DocumentTest {
    @Mock
    private AdminNotification adminNotification;

    @Mock
    private UserNotification userNotification;

    @Test
    public void testSave() throws Exception {
        Document document = new Document();

        document.save();
        verify(adminNotification, never()).update();
        verify(userNotification, never()).update();

        reset(adminNotification);
        reset(userNotification);
        document.addObserver(adminNotification);
        document.addObserver(userNotification);
        document.save();
        verify(adminNotification, times(1)).update();
        verify(userNotification, times(1)).update();

        reset(adminNotification);
        reset(userNotification);
        document.deleteObserver(userNotification);
        document.save();
        verify(adminNotification, times(1)).update();
        verify(userNotification, never()).update();
    }
}
