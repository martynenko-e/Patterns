package ua.martynenko.pattern.strategy.classic;

/**
 * Created by cleri on 04.10.2015.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public Object method(Object input){
        return String.format("Object: %s, %s", input, strategy.algorithm(input));
    }
}
