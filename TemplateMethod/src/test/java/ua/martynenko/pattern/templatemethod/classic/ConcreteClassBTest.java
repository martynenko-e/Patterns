package ua.martynenko.pattern.templatemethod.classic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
// так же и со вторым классом
public class ConcreteClassBTest {

    // тут нам мокито не надо :)

    @Test
    public void test() {
        // given

        // нам потребуется дореализовать его анонимно
        AbstractClass object = new ConcreteClassB();

        // when
        // вызываем наш шаблонный метод и передаем тестовые данные
        Object result = object.templateMethod("some_data");

        // then
        // проверяем, что он вернул нам
        assertEquals("default_algorithm1 plus algorithm4B some_data", result);
    }
}
