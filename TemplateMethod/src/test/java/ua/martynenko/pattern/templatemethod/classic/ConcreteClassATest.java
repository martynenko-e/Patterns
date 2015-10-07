package ua.martynenko.pattern.templatemethod.classic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.*;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
// �� ����� �������������� � ���������� ����������
// ��� ����� ��� �������������� ����
public class ConcreteClassATest {

    // ��� ��� ������ �� ���� :)

    @Test
    public void test() {
        // given

        // ��� ����������� ������������� ��� ��������
        AbstractClass object = new ConcreteClassA();

        // when
        // �������� ��� ��������� ����� � �������� �������� ������
        Object result = object.templateMethod("some_data");

        // then
        // ���������, ��� �� ������ ���
        assertEquals("algorithm1A plus algorithm4A some_data", result);
    }
}
