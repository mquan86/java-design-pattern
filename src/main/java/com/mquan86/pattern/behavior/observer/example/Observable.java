package com.mquan86.pattern.behavior.observer.example;



/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public interface Observable {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers();

}
