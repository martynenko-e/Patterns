package ua.martynenko.pattern.observer.sample.soft;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by cleri on 04.10.2015.
 */
public class CandidateImpl implements Candidate {

    protected Set<String> technologies = new HashSet<>();
    private String name;

    public CandidateImpl(String name, String...tech) {
        this.name = name;
        technologies.addAll(Arrays.asList(tech));
    }

    @Override
    public void haveANew(Collection<Vacancy> vacancies) {
        System.out.println(name);
        for (Vacancy vacancy: vacancies) {
            System.out.println("\t" + vacancy.toString());
        }
    }

    @Override
    public Set<String> getTechnologies() {
        return technologies;
    }
}
