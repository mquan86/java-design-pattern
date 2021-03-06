package com.mquan86.pattern.behavior.observer.example;

import java.util.Vector;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Document implements Observable {
    private Vector<Observer> observers;

    public Document() {
        observers = new Vector<>();
    }

    @Override
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void save() {
        notifyObservers();
    }
}
