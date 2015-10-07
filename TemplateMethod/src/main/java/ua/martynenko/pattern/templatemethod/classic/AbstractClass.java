package ua.martynenko.pattern.templatemethod.classic;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
public abstract class AbstractClass {

    public final Object templateMethod(Object input){
        Object data1 = algorithm1();
        algorithm2(input);
        algorithm3();
        Object data2 = algorithm4(input);

        return data1.toString() + " plus " + data2.toString();
    }

    protected Object algorithm1(){return "default_algorithm1"; }

    protected abstract void algorithm2(Object input);

    protected abstract void algorithm3();

    protected abstract Object algorithm4(Object input);

}
