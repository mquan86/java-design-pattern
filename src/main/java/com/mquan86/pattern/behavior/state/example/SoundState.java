package com.mquan86.pattern.behavior.state.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class SoundState implements MobileNotificationState {

    @Override
    public void showNotification(AlertNotification context, String message) {
        // Send the notification with sound.
    }

}
