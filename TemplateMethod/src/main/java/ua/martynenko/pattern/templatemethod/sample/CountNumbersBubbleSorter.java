package ua.martynenko.pattern.templatemethod.sample;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
public class CountNumbersBubbleSorter extends BubbleSorter {

    @Override
    protected boolean compare(Object o, Object o1) {
        String s1 = o.toString();
        String s2 = o1.toString();
        return (s1.length() - s1.replaceAll("[0-9]", "").length() <
                s2.length() - s2.replaceAll("[0-9]", "").length());
    }
}
