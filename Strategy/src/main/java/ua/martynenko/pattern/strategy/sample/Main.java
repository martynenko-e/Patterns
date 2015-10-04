package ua.martynenko.pattern.strategy.sample;

import java.util.Arrays;

/**
 * Created by cleri on 04.10.2015.
 */
public class Main {
    public static void main(String[] args) {

        Comparator comparator = new ToStringLengthComparator();

        BubbleSorter sorter = new BubbleSorter(comparator);

        System.out.println(Arrays.toString(sorter.sort(new Integer[] {123, 45, 3, 6, 12345, 456})));
        System.out.println(Arrays.toString(sorter.sort(new String[] {"HElle", "GO", "work", "unexpectable", "aproval", "world"})));
        System.out.println(Arrays.toString(sorter.sort(new Boolean[] {true, false, true})));


    }


}
