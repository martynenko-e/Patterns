package ua.martynenko.pattern.templatemethod.classic;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Integer input = new Integer(15);

        AbstractClass case1 = new ConcreteClassA();
        System.out.println("result is: " + case1.templateMethod(input));

//        result
//        algorithm2A prints 15
//        algorithm3A prints something
//        result is: algorithm1A plus algorithm4A 15

        System.out.println("========================");

        AbstractClass case2 = new ConcreteClassB();
        System.out.println("result is: " + case2.templateMethod(input));

//        result
//        algorithm2B prints 15
//        algorithm3B prints something
//        result is: default_algorithm1 plus algorithm4B 15
    }
}
