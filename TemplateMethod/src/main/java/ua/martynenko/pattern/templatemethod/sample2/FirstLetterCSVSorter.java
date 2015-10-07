package ua.martynenko.pattern.templatemethod.sample2;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
public class FirstLetterCSVSorter extends CSVSorter {
    @Override
    protected boolean compare(Object o, Object o1) {
        return o.toString().charAt(0) > o1.toString().charAt(0);
    }
}
