package ua.martynenko.pattern.strategy.classic;

/**
 * Created by cleri on 04.10.2015.
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public Object algorithm(Object input) {
        return String.format("toString: '%s'", input);
    }
}
