package ua.martynenko.pattern.decorator.interfaces;

/**
 * Created by cleri on 04.10.2015.
 */
public class ConcreteComponent implements Component {

    @Override
    public Object operation(Object input) {
        System.out.printf("Call Component.operation('%s')\n", input);

        Object result = input;

        System.out.printf("Exit Component.operation() with '%s'\n", result);
        return result;
    }
}
