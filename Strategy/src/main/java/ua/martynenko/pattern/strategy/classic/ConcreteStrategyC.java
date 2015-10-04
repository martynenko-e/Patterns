package ua.martynenko.pattern.strategy.classic;

/**
 * Created by cleri on 04.10.2015.
 */
public class ConcreteStrategyC implements Strategy {
    @Override
    public Object algorithm(Object input) {
        return String.format("class: '%s'", input.getClass().getSimpleName());
    }
}
