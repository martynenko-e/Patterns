package ua.martynenko.pattern.adapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cleri on 03.10.2015.
 */
public class AdapterTest {
    @Test
    public void test(){
        //given
        Target target = new Adapter();

        //when
        Object actual = target.request("data");

        //then
        assertEquals("Hello from Adaptee!", actual);
    }
}
