package ua.martynenko.pattern.observer.sample.soft;

/**
 * Created by cleri on 04.10.2015.
 */
public class RecruitingDepartment implements Recruiter {

    private Candidates newCandidates = new Candidates();
    private Candidates candidates= new Candidates();
    private Vacancies newVacancies = new Vacancies();
    private Vacancies vacancies = new Vacancies();

    @Override
    public void register(Candidate candidate) {
        newCandidates.add(candidate);
    }

    @Override
    public void addNew(Vacancy vacancy) {
        newVacancies.add(vacancy);
    }

    @Override
    public void remove(Candidate candidate) {
        candidates.removeCandidate(candidate);
        newCandidates.removeCandidate(candidate);
    }

    @Override
    public void notice() {
        candidates.notifyAll(newVacancies);

        newVacancies.moveTo(vacancies);

        newCandidates.notifyAll(vacancies);

        newCandidates.moveTo(candidates);
    }
}
