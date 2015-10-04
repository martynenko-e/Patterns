package ua.martynenko.pattern.strategy.classic;

/**
 * Created by cleri on 04.10.2015.
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public Object algorithm(Object input) {
        return String.format("length: '%s'", input.toString().length());
    }
}
