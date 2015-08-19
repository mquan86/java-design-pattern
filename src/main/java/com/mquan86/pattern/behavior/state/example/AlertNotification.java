package com.mquan86.pattern.behavior.state.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class AlertNotification {
    private MobileNotificationState state;

    public void alert(String message) {
        state.showNotification(this, message);
    }

    public void setState(MobileNotificationState state) {
        this.state = state;
    }
}
