package ua.martynenko.pattern.iterator.classic;

/**
 * Created by cleri on 06.10.2015.
 */
public interface Aggregate<T> {

    Iterator<T> createIterator();

}
