package ua.martynenko.pattern.strategy.sample;

/**
 * Created by cleri on 04.10.2015.
 */
public class ToStringLengthComparator implements Comparator{
    @Override
    public boolean compare(Object o1, Object o2) {
        return o1.toString().length() > o2.toString().length();
    }
}
