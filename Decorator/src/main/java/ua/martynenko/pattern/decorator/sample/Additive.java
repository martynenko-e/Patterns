package ua.martynenko.pattern.decorator.sample;


public abstract class Additive extends Beverage{

    private Beverage beverage;

    public Additive(Beverage component){
        this.beverage = component;
    }
    @Override
    public int cost() {
        return beverage.cost();
    }
    @Override
    public String description() {
        return beverage.description() + " + ";
    }
}
