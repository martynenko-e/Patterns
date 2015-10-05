package ua.martynenko.pattern.observer.sample.hard;

import java.util.Set;

/**
 * Created by cleri on 05.10.2015.
 */
public interface Resume {

    Candidate getCandidate();

    Set<String> getTechnologies();
}
