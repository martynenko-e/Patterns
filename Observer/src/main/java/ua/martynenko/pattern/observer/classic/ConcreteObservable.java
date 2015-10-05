package ua.martynenko.pattern.observer.classic;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by cleri on 04.10.2015.
 */
public class ConcreteObservable implements Observable {

    private Collection<Observer> observers  = new LinkedList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(Object data) {
        for (Observer observer: observers) {
            observer.handleEvent(data);
        }
    }
}
