package ua.martynenko.pattern.observer.classic;

/**
 * Created by cleri on 04.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Observable observable = new ConcreteObservable();

        Observer observer1 = new ConcreteObserverA();
        observable.addObserver(observer1);

        Observer observer2 = new ConcreteObserverA();
        observable.addObserver(observer2);

        Observer observer3 = new ConcreteObserverB();
        observable.addObserver(observer3);


        observable.notifyObservers("Hello Observer");

        observable.removeObserver(observer2);

        observable.notifyObservers("Hello Again");
    }
}
