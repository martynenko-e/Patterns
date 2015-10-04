package ua.martynenko.pattern.strategy.sample;

/**
 * Created by cleri on 04.10.2015.
 */
public class FirstLetterComparator implements Comparator {
    @Override
    public boolean compare(Object o1, Object o2) {
        return o1.toString().charAt(0) > o2.toString().charAt(0);
    }
}
