package ua.martynenko.pattern.decorator.sample;

/**
 * Created by cleri on 04.10.2015.
 */
public class Tea extends Beverage {
    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String description() {
        return "Tea";
    }
}
