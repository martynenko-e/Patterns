package ua.martynenko.pattern.observer.sample.soft;

/**
 * Created by cleri on 04.10.2015.
 */
public class Main {
    public static void main(String[] args) {

        Recruiter recruiter = new RecruitingDepartment();

        System.out.println("--------- Day1 ----------");

        Candidate candidate1 = new CandidateImpl("Eva Pupkina", "J2EE");
        Candidate candidate2 = new CandidateImpl("Stiven Pupkina", "J2SE", "Android");

        recruiter.register(candidate1);
        recruiter.register(candidate2);

        recruiter.addNew(new Project("NifNif", "J2SE", "Android"));
        recruiter.addNew(new Project("NufNuf", "J2EE"));

        recruiter.notice();

        System.out.println("--------- Day2 ----------");

        Candidate candidate3 = new CandidateImpl("Mister Angular", "JavaScript", "Angular");
        Candidate candidate4 = new CandidateImpl("Bob Marley", "J2SE", "JavaScript");

        recruiter.register(candidate3);
        recruiter.register(candidate4);

        recruiter.remove(candidate1);

        recruiter.addNew(new Project("NafNaf", "JavaScript", "J2SE"));
        recruiter.addNew(new Project("NifNif", "J2SE", "Android"));
        recruiter.addNew(new Project("NufNuf", "J2EE"));

        recruiter.notice();
    }
}
