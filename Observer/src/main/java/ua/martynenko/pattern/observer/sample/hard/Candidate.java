package ua.martynenko.pattern.observer.sample.hard;

import java.util.Collection;

/**
 * Created by cleri on 05.10.2015.
 */
public interface Candidate {
    // кандидат умеет получать уведомления о вакансиях
    void haveANew(Collection<Vacancy> vacancies);
}
