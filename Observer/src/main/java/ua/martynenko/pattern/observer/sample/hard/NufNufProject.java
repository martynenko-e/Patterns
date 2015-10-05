package ua.martynenko.pattern.observer.sample.hard;

import java.util.Set;

/**
 * Created by cleri on 05.10.2015.
 */
public class NufNufProject implements Vacancy {
    @Override
    public boolean check(Set<String> technologies) {
        return technologies.contains("J2SE");
    }

    @Override
    public String toString() {
        return "NufNufProject{'J2SE', trainee}";
    }
}
