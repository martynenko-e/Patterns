package ua.martynenko.pattern.adapter2;

/**
 * Created by cleri on 03.10.2015.
 */
public class Adapter extends Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public Object request(Object input) {
        return adaptee.specificRequest(input);
    }
}
