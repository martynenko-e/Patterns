package ua.martynenko.pattern.decorator.sample;

/**
 * Created by cleri on 04.10.2015.
 */
public class Water extends Beverage {
    @Override
    public int cost() {
        return 1;
    }

    @Override
    public String description() {
        return "Water";
    }
}
