package ua.martynenko.pattern.observer.sample.soft;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by cleri on 04.10.2015.
 */
public class Candidates {

    private List<Candidate> list = new LinkedList<>();

    public void add(Candidate candidate) {
        list.add(candidate);
    }

    public void removeCandidate(Candidate candidate) {
        list.remove(candidate);
    }

    public void notifyAll(Vacancies vacancies) {
        for (Candidate candidate: list) {
            Vacancies selected = vacancies.filter(candidate.getTechnologies());
            if (!selected.isEmpty()) {
                candidate.haveANew(selected.getCopy());
            }
        }
    }

    void moveTo(Candidates candidates){
        candidates.list.addAll(list);
        list.clear();
    }

}
