package ua.martynenko.pattern.templatemethod.sample2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
public class ToStringLengthCSVSorterTest {

    // given
    // �� �������������� ������� �����������
    CSVSorter sorter = new ToStringLengthCSVSorter();

    // � ������
    @Test
    public void testSortingInteger() {
        // when
        String actual = sorter.sort("123,45,3,6,12345,456");

        // then
        assertEquals("3<sep>6<sep>45<sep>123<sep>456<sep>12345",actual);
    }

    @Test
    public void testSortingString() {
        // when
        String actual = sorter.sort("sekfhseflj,ds,sdseee,d,dsds,y");

        // then
        assertEquals("d<sep>y<sep>ds<sep>dsds<sep>sdseee<sep>sekfhseflj", actual);
    }

    @Test
    public void testSortingBoolean() {
        // when
        String actual = sorter.sort("true,true,false,true");

        // then
        assertEquals("true<sep>true<sep>true<sep>false", actual);
    }
}
