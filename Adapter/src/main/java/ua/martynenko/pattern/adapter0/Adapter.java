package ua.martynenko.pattern.adapter0;

/**
 * Created by cleri on 03.10.2015.
 */
public class Adapter implements Target{


    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public Object request(Object input) {
        return adaptee.specificRequest(input);
    }
}
