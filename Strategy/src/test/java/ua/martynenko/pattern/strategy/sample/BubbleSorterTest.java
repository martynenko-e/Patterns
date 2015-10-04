package ua.martynenko.pattern.strategy.sample;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by cleri on 04.10.2015.
 */
public class BubbleSorterTest {
    @Test
    public void testSorting() {
        //given
        BubbleSorter sorter = new BubbleSorter(new Comparator() {
            public boolean compare(Object o1, Object o2) {
                return Integer.valueOf((String) o1) > Integer.valueOf((String) o2);
            }
        });

        //when
        Object[] actual = sorter.sort(new String[]{"1", "3", "6", "2", "4", "5"});

        //then
        assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(actual));
    }
}
