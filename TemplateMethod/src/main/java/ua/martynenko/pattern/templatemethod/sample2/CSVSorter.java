package ua.martynenko.pattern.templatemethod.sample2;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
public abstract class CSVSorter {
    
    private static final String DEFAULT_SEPARATOR = ",";
    
    public final String sort(String input) {
        Object[] array = split(input, getInputSeparator());
        Object[] sorted = sort(array);
        
        return join(sorted, getOutputSeparator());
    }

    protected Object[] sort(Object[] input) {
        Object[] result = new Object[input.length];
        for (int i = 0; i < input.length ; i++) {
            result[i] = input[i];
        }

        for (int c = 0; c < input.length - 1; c++) {
            for (int d = 0; d < input.length - c - 1; d++) {
                if (compare(result[d], result[d + 1])) {
                    Object swap = result[d];
                    result[d] = result[d + 1];
                    result[d + 1] = swap;
                }
            }
        }
        return result;
    }

    private String join(Object[] objects, String separator) {
        StringBuffer result = new StringBuffer();
        for (int index = 0; index < objects.length; index++) {
            Object object = objects[index];
            result.append(object);

            if (index < objects.length - 1) {
                result.append(separator);
            }
        }
        return result.toString();
    }

    private Object[] split(String input, String separator) {
        return input.split("\\Q" + separator + "\\E");
    }

    protected String getOutputSeparator() { return DEFAULT_SEPARATOR;}
    protected String getInputSeparator() { return DEFAULT_SEPARATOR;}

    protected abstract boolean compare(Object o, Object o1);

}
