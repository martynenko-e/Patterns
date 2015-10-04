package ua.martynenko.pattern.decorator.classic;

/**
 * Created by cleri on 04.10.2015.
 */
public abstract class Decorator extends Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public Object operation(Object input) {
        return component.operation(input);
    }
}
