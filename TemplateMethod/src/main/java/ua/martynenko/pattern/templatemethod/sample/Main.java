package ua.martynenko.pattern.templatemethod.sample;

import java.util.Arrays;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
public class Main {
    public static void main(String[] args) {

        BubbleSorter sorter = new ToStringLengthBubbleSorter();

        System.out.println(Arrays.toString(sorter.sort(new Integer[]{123, 45, 34, 534, 63433})));
        System.out.println(Arrays.toString(sorter.sort(new String[]{"jfslkf", "fjsklf", "dd", "fjdsklfssss"})));
        System.out.println(Arrays.toString(sorter.sort(new Boolean[]{true, false, true, false})));


    }
}
