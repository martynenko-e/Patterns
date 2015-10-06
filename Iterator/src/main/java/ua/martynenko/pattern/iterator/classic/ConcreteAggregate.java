package ua.martynenko.pattern.iterator.classic;

/**
 * Created by Martynenko Yevhen on 06.10.2015.
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    final Object[] array;

    public ConcreteAggregate(int count) {
        this.array = new Object[count];
    }

    public void set(int index, T value){
        array[index] = value;
    }

    public Iterator<T> createIterator() {
        return new ConcreteIterator<T>(this);
    }
}
