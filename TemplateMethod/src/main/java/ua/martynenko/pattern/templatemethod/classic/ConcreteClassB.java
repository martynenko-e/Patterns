package ua.martynenko.pattern.templatemethod.classic;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
public class ConcreteClassB extends AbstractClass {

    @Override
    protected void algorithm2(Object input) {
        System.out.println("algorithm2B prints " + input);
    }

    @Override
    protected void algorithm3() {
        System.out.println("algorithm3B prints something");
    }

    @Override
    protected Object algorithm4(Object input) {
        return "algorithm4B " + input;
    }
}
