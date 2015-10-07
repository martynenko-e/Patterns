package ua.martynenko.pattern.templatemethod.classic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
// ��� �� � �� ������ �������
public class ConcreteClassBTest {

    // ��� ��� ������ �� ���� :)

    @Test
    public void test() {
        // given

        // ��� ����������� ������������� ��� ��������
        AbstractClass object = new ConcreteClassB();

        // when
        // �������� ��� ��������� ����� � �������� �������� ������
        Object result = object.templateMethod("some_data");

        // then
        // ���������, ��� �� ������ ���
        assertEquals("default_algorithm1 plus algorithm4B some_data", result);
    }
}
