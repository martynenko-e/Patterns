package ua.martynenko.pattern.observer.sample.hard;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cleri on 05.10.2015.
 */
public class Candidates {

    private List<Resume> list = new LinkedList<Resume>();

    // ��� ��� ��������� �� ��������� �� ��� ������ � ������� �� ����� ���������
    // �� ��� ��� � �����
    void removeCandidate(Candidate candidate) {
        Collection<Resume> resumeForRemove = new LinkedList<Resume>();

        for (Resume resume : list) {
            if (resume.getCandidate().equals(candidate)) {
                resumeForRemove.add(resume);
            }
        }

        list.removeAll(resumeForRemove);
    }

    // ����� ����������� ���� ���������� ������� ��������
    void noticeAll(Vacancies vacancies) {
        for (Resume resume : list) {
            // ������, ��� ������ �����������
            Vacancies selected = vacancies.filter(resume.getTechnologies());
            // � ���� ���� ��� �����
            if (!selected.isEmpty()) {
                // � ����� ���������� � �������������
                resume.getCandidate().haveANew(selected.getCopy());
            }
        }
    }

    // ����� ���������� ������ ��������� � ������
    void add(Resume resume) {
        list.add(resume);
    }

    // ����� �������� ���� ������ � ������ ������ ����������
    void moveTo(Candidates candidates) {
        candidates.list.addAll(list);
        list.clear();
    }
}
