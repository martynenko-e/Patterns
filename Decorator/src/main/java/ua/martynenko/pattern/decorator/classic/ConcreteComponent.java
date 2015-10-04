package ua.martynenko.pattern.decorator.classic;

/**
 * Created by cleri on 04.10.2015.
 */
public class ConcreteComponent extends Component{
    @Override
    public Object operation(Object input) {
        System.out.printf("Call Component.operation('%s')\n", input);

        Object result = input;

        System.out.printf("Exit Component.operation() with '%s'\n", result);
        return result;
    }
}
