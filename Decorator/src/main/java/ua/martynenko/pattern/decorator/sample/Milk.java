package ua.martynenko.pattern.decorator.sample;

/**
 * Created by cleri on 04.10.2015.
 */
public class Milk extends Additive {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return super.cost() + 3;
    }

    @Override
    public String description() {
        return super.description() + "Milk";
    }
}
