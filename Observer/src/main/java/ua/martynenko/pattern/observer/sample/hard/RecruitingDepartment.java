package ua.martynenko.pattern.observer.sample.hard;

/**
 * Created by cleri on 05.10.2015.
 */
public class RecruitingDepartment implements Recruiter {

    // ��������� ���� ���-�� �������� ����� ���������� �� ������
    // ��� ����� ��������� ������ ����� ����������
    private Candidates newCandidates = new Candidates();

    // � ������ ���� ������ ���������� - ��� ���, ��� ���� ��� ������� �����������
    private Candidates candidates = new Candidates();

    // ��������� ���� �������� ������� ���� ����� ��������
    private Vacancies newVacancies = new Vacancies();

    // �� ��� �� ��� ���� ������������ ���-�� ��������, ������� ��� ������������
    private Vacancies vacancies = new Vacancies();


    @Override
    // � ������, ����� �������� ���������� � ��������� �� �������� ���� ������
    public void register(Resume resume) {
        // �������� ��������� ������ ��������� � ����� ������ ����� ����������
        newCandidates.add(resume);
    }

    @Override
    // ��������� ������ ����� ��������
    public void addNew(Vacancy vacancy) {
        // � �� �� ������� � ���� ������ ����� ��������
        newVacancies.add(vacancy);
    }

    @Override
    // ����� ������� �� ��������
    public void remove(Candidate candidate) {
        // ������� ������ ��������� �� ��������� ������, ���� �� ��� ����
        candidates.removeCandidate(candidate);

        // �� �� ����������� �� ������� ��������� ����������
        newCandidates.removeCandidate(candidate);
    }

    @Override
    // � ��� ������ ������� ���������� ���� ����������
    public void notice() {
        // �� ������� ������ � ���������� ���� ���������� ��� ����,
        // ��� ���������� �� ����� � �������� ����������
        candidates.noticeAll(newVacancies);

        // ����� �� ��������� ����� �������� � ������-�������
        newVacancies.moveTo(vacancies);

        // ����� �� ���������� ���� ��������� ����� ����������
        newCandidates.noticeAll(vacancies);

        // ����� ���� ��������� ������ ��������� ���������� � �������� ������
        newCandidates.moveTo(candidates);
    }
}
