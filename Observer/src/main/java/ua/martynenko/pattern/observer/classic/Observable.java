package ua.martynenko.pattern.observer.classic;

/**
 * Created by cleri on 04.10.2015.
 */
public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Object data);
}
