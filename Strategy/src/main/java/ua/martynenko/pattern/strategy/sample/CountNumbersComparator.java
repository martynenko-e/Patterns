package ua.martynenko.pattern.strategy.sample;

/**
 * Created by cleri on 04.10.2015.
 */
public class CountNumbersComparator implements Comparator{
    @Override
    public boolean compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return (s1.length() - s1.replaceAll("[0-9]", "").length()) <
                (s2.length() - s2.replaceAll("[0-9]", "").length());
    }
}
