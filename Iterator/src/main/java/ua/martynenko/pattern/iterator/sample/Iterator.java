package ua.martynenko.pattern.iterator.sample;

/**
 * Created by Martynenko Yevhen on 06.10.2015.
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();

    void remove();
}
