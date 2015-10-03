package ua.martynenko.pattern.adapter2;

/**
 * Created by cleri on 03.10.2015.
 */
public class Target {
    public Object request(Object input) {
        System.out.println("Call Target.request(" + input + ")");
        return "Hello from Target!";
    }
}
