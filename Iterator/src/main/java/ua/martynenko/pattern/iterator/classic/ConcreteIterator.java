package ua.martynenko.pattern.iterator.classic;

import java.util.NoSuchElementException;

/**
 * Created by Martynenko Yevhen on 06.10.2015.
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private ConcreteAggregate<T> aggregate;
    private int index;

    public ConcreteIterator(ConcreteAggregate<T> aggregate) {
        this.aggregate = aggregate;
        first();
    }

    public void first() {
        index = 0;
    }

    public void next() {
        index++;
    }

    public boolean isDone() {
        return index >= size();
    }

    private int size(){
        return aggregate.array.length;
    }

    public T currentItem() {
        if (isDone()) {
            throw new NoSuchElementException();
        }
        return (T)aggregate.array[index];
    }
}
