package ua.martynenko.pattern.decorator.classic;

/**
 * Created by cleri on 04.10.2015.
 */
public class ConcreteDecoratorA extends Decorator{

    private String addedState;

    public ConcreteDecoratorA(Component component, String addedState) {
        super(component);
        this.addedState = addedState;
    }

    @Override
    public Object operation(Object input) {
        System.out.printf("Call ConcreteDecoratorA.operation('%s') with state: '%s'\n", input, addedState);

        Object result = "[before]" + super.operation(input + " " + addedState) + "[after]";

        System.out.printf("Exit ConcreteDecoratorA.operation() with '%s'\n", result);

        return result;
    }
}
