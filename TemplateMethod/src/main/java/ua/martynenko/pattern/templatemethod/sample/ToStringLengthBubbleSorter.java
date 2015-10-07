package ua.martynenko.pattern.templatemethod.sample;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
public class ToStringLengthBubbleSorter extends BubbleSorter {
    @Override
    protected boolean compare(Object o, Object o1) {
        return o.toString().length() > o1.toString().length();
    }
}
