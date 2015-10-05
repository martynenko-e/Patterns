package ua.martynenko.pattern.observer.sample.soft;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by cleri on 04.10.2015.
 */
public class Project implements Vacancy {

    private Set<String> technologies = new HashSet<>();
    private String name;

    public Project(String name, String...tech) {
        this.name = name;
        technologies.addAll(Arrays.asList(tech));
    }

    @Override
    public boolean check(Set<String> technologies) {
        return technologies.containsAll(this.technologies);
    }

    @Override
    public String toString() {
        return String.format("%sProject%s", name, technologies);
    }
}
