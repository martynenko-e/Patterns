package ua.martynenko.pattern.decorator.sample;

/**
 * Created by cleri on 04.10.2015.
 */
public class Sugar extends Additive {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }

    @Override
    public String description() {
        return super.description() + "Sugar";
    }
}
