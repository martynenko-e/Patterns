package ua.martynenko.pattern.observer.sample.soft;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by cleri on 04.10.2015.
 */
public class Vacancies {
    private List<Vacancy> list = new LinkedList<>();
    public void add(Vacancy vacancy) {
        list.add(vacancy);
    }

    Collection<Vacancy> getCopy() {
        return new LinkedList<Vacancy>(list);
    }

    public void moveTo(Vacancies vacancies) {
        vacancies.list.addAll(list);
        list.clear();
    }

    public Vacancies filter(Set<String> technologies) {
        Vacancies result = new Vacancies();

        for (Vacancy vacancy: list) {
            if (vacancy.check(technologies)) {
                result.add(vacancy);
            }
        }
        return result;
    }

    boolean isEmpty(){
        return list.isEmpty();
    }
}
