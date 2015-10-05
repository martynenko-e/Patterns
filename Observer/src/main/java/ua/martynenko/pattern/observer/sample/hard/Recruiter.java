package ua.martynenko.pattern.observer.sample.hard;

/**
 * Created by cleri on 05.10.2015.
 */
public interface Recruiter {

    // ����� ���� ����� ���������� ����� ����������� �� ��������

    // ������ ��������������� �������� �����
    // void register(Candidate candidate);
    // �� ������ ��� ������ ���������� ������
    void register(Resume resume);

    // ���-�� ����� ����� ���� ����� ��������� ��������� ����� ��������
    void addNew(Vacancy vacancy);

    // �������� ����� ���������� �� ����� ���������
    void remove(Candidate candidate);

    // � ������� ����� ������ ��������� �������� �������
    // ���������� ���� ����������
    void notice();
}
