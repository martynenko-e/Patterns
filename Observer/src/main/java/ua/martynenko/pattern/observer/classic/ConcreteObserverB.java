package ua.martynenko.pattern.observer.classic;

/**
 * Created by cleri on 04.10.2015.
 */
public class ConcreteObserverB implements Observer {
    public void handleEvent(Object input) {
        System.out.println("ConcreteObserverB: " + input + "! Super!");
    }
}
