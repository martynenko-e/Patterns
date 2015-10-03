package ua.martynenko.pattern.adapter2;

/**
 * Created by cleri on 03.10.2015.
 */
public class Adaptee {
    public Object specificRequest(Object input) {
        System.out.println("Call Adaptee.request(" + input + ")");
        return "Hello from Adaptee!";
    }
}
