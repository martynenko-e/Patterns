package ua.martynenko.pattern.adapter0;

/**
 * Created by cleri on 03.10.2015.
 */
public class Adaptee {

    public Object specificRequest(Object input) {
        System.out.println("Call Adaptee.specificRequest(" + input + ")");
        return "Hello from Adaptee!";
    }
}
