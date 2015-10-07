package ua.martynenko.pattern.templatemethod.sample2;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
public class ToStringLengthCSVSorter extends CSVSorter {

    @Override
    protected String getOutputSeparator() {
        return "<sep>";
    }

    @Override
    protected String getInputSeparator() {
        return ",";
    }

    @Override
    protected boolean compare(Object o, Object o1) {
        return o.toString().length() > o1.toString().length();
    }

    @Override
    protected Object[] sort(Object[] input) {
        for (int i = 1; i < input.length ; i++) {
            Object key = input[i];
            int j = i - 1;
            while (j >= 0 && compare(input[j], key)) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key;
        }
        return input;
    }
}
