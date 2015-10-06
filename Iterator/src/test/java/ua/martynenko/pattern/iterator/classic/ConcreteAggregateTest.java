package ua.martynenko.pattern.iterator.classic;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Martynenko Yevhen on 06.10.2015.
 */
public class ConcreteAggregateTest {

    @Test
    public void testFirstElementWhenCreateIterator(){
        //given
        ConcreteAggregate aggregate = new ConcreteAggregate<String>(2);

        aggregate.set(0, "one");
        aggregate.set(1, "two");

        Iterator<String> iterator = aggregate.createIterator();

        //when
        String value = iterator.currentItem();

        //then
        assertEquals("one", value);
    }

    @Test
    public void testSecondElementWhenCreateIterator(){
        //given
        ConcreteAggregate aggregate = new ConcreteAggregate<String>(3);

        aggregate.set(0, "one");
        aggregate.set(1, "two");
        aggregate.set(2, "three");

        Iterator<String> iterator = aggregate.createIterator();

        //when
        iterator.next();
        String value = iterator.currentItem();

        //then
        assertEquals("two", value);
    }

    @Test
    public void testThirdElementWhenCreateIterator(){
        //given
        ConcreteAggregate aggregate = new ConcreteAggregate<String>(3);

        aggregate.set(0, "one");
        aggregate.set(1, "two");
        aggregate.set(2, "three");

        Iterator<String> iterator = aggregate.createIterator();

        //when
        iterator.next();
        iterator.next();
        String value = iterator.currentItem();

        //then
        assertEquals("three", value);
    }

    @Test(expected = NoSuchElementException.class)
    public void testErrorWhenCallGetItemAtEndOfAggregate(){
        //given
        ConcreteAggregate aggregate = new ConcreteAggregate<String>(3);

        aggregate.set(0, "one");
        aggregate.set(1, "two");
        aggregate.set(2, "three");

        Iterator<String> iterator = aggregate.createIterator();

        //when
        iterator.next();
        iterator.next();
        iterator.next();

        iterator.currentItem();

        //then
        //exception will be throw
    }

    @Test(expected = NoSuchElementException.class)
    public void testErrorWhenCallGetItemAtEmptyAggregate(){
        //given
        ConcreteAggregate aggregate = new ConcreteAggregate<String>(0);


        Iterator<String> iterator = aggregate.createIterator();

        //when
        iterator.currentItem();

        //then
        //exception will be throw
    }

    @Test
    public void testIsDoneMustBeTrueCallItOnEmptyAggregate(){
        //given
        ConcreteAggregate aggregate = new ConcreteAggregate<String>(0);



        Iterator<String> iterator = aggregate.createIterator();

        //when
        boolean done = iterator.isDone();

        //then
        assertTrue(done);
    }

    @Test
    public void testIsDoneMustBeFalseWhenCreateIteratorOfNotEmptyAggregate(){
        //given
        ConcreteAggregate aggregate = new ConcreteAggregate<String>(1);

        aggregate.set(0, "one");


        Iterator<String> iterator = aggregate.createIterator();

        //when
        boolean done = iterator.isDone();

        //then
        assertFalse(done);
    }

    @Test
    public void testIsDoneIsTrueAtEndOfIterator(){
        //given
        ConcreteAggregate aggregate = new ConcreteAggregate<String>(1);

        aggregate.set(0, "one");


        Iterator<String> iterator = aggregate.createIterator();
        iterator.next();

        //when
        boolean done = iterator.isDone();

        //then
        assertTrue(done);
    }
}
