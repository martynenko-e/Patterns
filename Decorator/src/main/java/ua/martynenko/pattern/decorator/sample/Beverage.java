package ua.martynenko.pattern.decorator.sample;

/**
 * Created by cleri on 04.10.2015.
 */
public abstract class Beverage {
    public abstract int cost();

    public abstract String description();

    @Override
    public String toString() {
        return String.format("%s = %s$", description(), cost());
    }
}
