package com.mquan86.pattern.behavior.state.example;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class AlertNotificationTest {
    @Mock
    private SoundState soundState;

    @Mock
    private VibrationState vibrationState;

    @Test
    public void testAlert() throws Exception {
        AlertNotification notification = new AlertNotification();
        notification.setState(soundState);
        notification.alert("any message");
        verify(soundState, times(1)).showNotification(any(AlertNotification.class), anyString());

        notification.setState(vibrationState);
        notification.alert("any message");
        verify(vibrationState, times(1)).showNotification(any(AlertNotification.class),
                anyString());
    }
}
