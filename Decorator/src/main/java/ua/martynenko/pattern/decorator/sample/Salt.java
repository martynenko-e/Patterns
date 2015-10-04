package ua.martynenko.pattern.decorator.sample;

/**
 * Created by cleri on 04.10.2015.
 */
public class Salt extends Additive {
    public Salt(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }

    @Override
    public String description() {
        return super.description() + "Salt";
    }
}
