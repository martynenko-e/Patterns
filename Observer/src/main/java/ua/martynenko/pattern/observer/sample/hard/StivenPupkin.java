package ua.martynenko.pattern.observer.sample.hard;

import java.util.Collection;

/**
 * Created by cleri on 05.10.2015.
 */
public class StivenPupkin extends AbstractCandidate implements Candidate{

    public StivenPupkin() {
        technologies.add("J2SE");
        technologies.add("Android");
    }

    @Override
    public void haveANew(Collection<Vacancy> vacancies) {
        System.out.println("StivenPupkin: Nice! New vacancies:");
        for (Vacancy vacancy : vacancies) {
            System.out.println("\t" + vacancy.toString());
        }
    }
}
