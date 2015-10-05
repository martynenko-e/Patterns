package ua.martynenko.pattern.observer.sample.hard;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by cleri on 05.10.2015.
 */
public abstract class AbstractCandidate implements Candidate{

    protected Set<String> technologies = new HashSet<>();

    public Resume getResume() {
        return new Resume() {
            @Override
            public Candidate getCandidate() {
                return AbstractCandidate.this;
            }

            @Override
            public Set<String> getTechnologies() {
                return AbstractCandidate.this.technologies;
            }
        };
    }
}
