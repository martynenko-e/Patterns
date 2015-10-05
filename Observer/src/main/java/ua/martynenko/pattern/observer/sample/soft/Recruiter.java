package ua.martynenko.pattern.observer.sample.soft;

/**
 * Created by cleri on 04.10.2015.
 */
public interface Recruiter {

    // register the candidate
    void register(Candidate candidate);

    // add new vacancy
    void addNew(Vacancy vacancy);

    // candidate remove from recruiting list
    void remove(Candidate candidate);

    void notice();
}
