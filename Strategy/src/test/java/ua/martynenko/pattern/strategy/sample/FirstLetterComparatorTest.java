package ua.martynenko.pattern.strategy.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cleri on 04.10.2015.
 */
public class FirstLetterComparatorTest {
    private Comparator comparator = new FirstLetterComparator();

    @Test
    public void testAlphabet(){
        assertEquals(true, comparator.compare("q", "a"));
        assertEquals(false, comparator.compare("a", "q"));

        assertEquals(true, comparator.compare("2", "1"));
        assertEquals(false, comparator.compare("1", "2"));

        assertEquals(true, comparator.compare("a", "1"));
        assertEquals(false, comparator.compare("1", "a"));
    }

    @Test
    public void testOnlyFirstLetter(){
        assertEquals(false, comparator.compare("q", "q"));
        assertEquals(false, comparator.compare("q", "qq"));
        assertEquals(false, comparator.compare("qq", "qb"));
        assertEquals(false, comparator.compare("qqq", "qwe"));

    }


}
