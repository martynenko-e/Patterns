package ua.martynenko.pattern.adapter1;

/**
 * Created by cleri on 03.10.2015.
 */
public class Adapter extends Adaptee implements Target {
    public Object request(Object input) {
        return super.specificRequest(input);
    }
}
