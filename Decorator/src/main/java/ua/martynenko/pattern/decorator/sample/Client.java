package ua.martynenko.pattern.decorator.sample;

/**
 * Created by cleri on 04.10.2015.
 */
public class Client {
    public static void main(String[] args) {
        Beverage saltWater = new Salt(new Water());
        System.out.println("Salt water: " + saltWater);

        Beverage sweetTea = new Sugar(new Sugar(new Tea()));
        System.out.println("Sweet tea: " + sweetTea);

        Beverage cappuccino = new Sugar(new Milk(new Milk(new Coffee())));
        System.out.println("Cappuccino: " + cappuccino);
    }

}
