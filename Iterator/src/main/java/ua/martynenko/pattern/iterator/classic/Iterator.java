package ua.martynenko.pattern.iterator.classic;

/**
 * Created by cleri on 06.10.2015.
 */
public interface Iterator<T> {

    void first();

    void next();

    boolean isDone();

    T currentItem();
}
