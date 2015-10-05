package ua.martynenko.pattern.observer.sample.soft;

import java.util.Collection;
import java.util.Set;

/**
 * Created by cleri on 04.10.2015.
 */
public interface Candidate {

    void haveANew(Collection<Vacancy> vacancies);

    Set<String> getTechnologies();
}
