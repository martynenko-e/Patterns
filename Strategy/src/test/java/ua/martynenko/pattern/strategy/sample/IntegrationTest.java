package ua.martynenko.pattern.strategy.sample;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by cleri on 04.10.2015.
 */
public class IntegrationTest {

    @Test
    public void testSorting_withFirstLetterComparator(){
        //given
        BubbleSorter sorter = new BubbleSorter(new FirstLetterComparator());

        //when
        Object[] actual = sorter.sort(new Object[]{"123456", 32432, true, 3.5, "3"});

        //then
        assertEquals("[123456, 32432, 3.5, 3, true]", Arrays.toString(actual));
    }

    @Test
    public void testSorting_withToStringLengthComparator(){
        //given
        BubbleSorter sorter = new BubbleSorter(new ToStringLengthComparator());

        //when
        Object[] actual = sorter.sort(new Object[]{"123456", 32432, true, 3.5, "3"});

        //then
        assertEquals("[3, 3.5, true, 32432, 123456]", Arrays.toString(actual));
    }
}
