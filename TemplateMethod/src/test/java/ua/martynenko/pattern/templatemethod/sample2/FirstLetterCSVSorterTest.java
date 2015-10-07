package ua.martynenko.pattern.templatemethod.sample2;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
public class FirstLetterCSVSorterTest {

    // given
    // мы инстранциируем готовый сортировщик
    CSVSorter sorter = new FirstLetterCSVSorter();

    // и тестим
    @Test
    public void testSortingInteger() {
        // when
        String actual = sorter.sort("123,45,3,6,12345,456");

        // then
        assertEquals("123,12345,3,45,456,6", actual);
    }

    @Test
    public void testSortingString() {
        // when
        String actual = sorter.sort("sekfhseflj,ds,sdseee,d,dsds,y");

        // then
        assertEquals("ds,d,dsds,sekfhseflj,sdseee,y", actual);
    }

    @Test
    public void testSortingBoolean() {
        // when
        String actual = sorter.sort("true,true,false,true");

        // then
        assertEquals("false,true,true,true", actual);
    }
}
