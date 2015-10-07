package ua.martynenko.pattern.templatemethod.sample2;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
public class CountNumbersCSVSorter extends CSVSorter{

    private final String separator;

    public CountNumbersCSVSorter(String separator) {
        this.separator = separator;
    }

    @Override
    protected boolean compare(Object o, Object o1) {
        String s1 = o.toString();
        String s2 = o1.toString();
        return (s1.length() - s1.replaceAll("[0-9]", "").length() <
                s2.length() - s2.replaceAll("[0-9]", "").length());
    }

    @Override
    protected String getInputSeparator() {
        return separator;
    }

    @Override
    protected String getOutputSeparator() {
        return separator;
    }
}
