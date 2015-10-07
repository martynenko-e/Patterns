package ua.martynenko.pattern.templatemethod.sample;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
public class FirstLetterBubbleSorter extends BubbleSorter{
    @Override
    protected boolean compare(Object o, Object o1) {
        return o.toString().charAt(0) > o1.toString().charAt(0);
    }
}
