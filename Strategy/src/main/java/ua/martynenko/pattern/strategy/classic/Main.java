package ua.martynenko.pattern.strategy.classic;

/**
 * Created by cleri on 04.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Boolean input = new Boolean(true);

        Context context = new Context(new ConcreteStrategyA());
        System.out.println(context.method(input));

        context.setStrategy(new ConcreteStrategyB());
        System.out.println(context.method(input));

        context.setStrategy(new ConcreteStrategyC());
        System.out.println(context.method(input));
    }
}
