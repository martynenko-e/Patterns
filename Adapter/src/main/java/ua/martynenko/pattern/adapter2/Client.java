package ua.martynenko.pattern.adapter2;

/**
 * Created by cleri on 03.10.2015.
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        doit(target);
    }

    public static void doit(Target target){
        System.out.println(target.request("Hello World"));
    }

}
