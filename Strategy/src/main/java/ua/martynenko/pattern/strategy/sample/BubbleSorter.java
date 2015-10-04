package ua.martynenko.pattern.strategy.sample;

/**
 * Created by cleri on 04.10.2015.
 */
public class BubbleSorter {

    private Comparator comparator;

    public BubbleSorter(Comparator comparator) {
        this.comparator = comparator;
    }

    public Object [] sort(Object [] input) {
        Object[] result = new Object[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i];
        }

        for (int a = 0; a < input.length - 1; a++) {
            for (int b = 0; b < input.length - 1 - a; b++) {
                if (comparator.compare(result[b], result[b + 1])) {
                    Object swap = result[b];
                    result[b] = result[b + 1];
                    result[b + 1] = swap;
                }
            }
        }

        return result;
    }
}
