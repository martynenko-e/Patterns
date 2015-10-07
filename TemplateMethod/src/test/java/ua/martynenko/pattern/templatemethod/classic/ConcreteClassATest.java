package ua.martynenko.pattern.templatemethod.classic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.*;

/**
 * Created by Martynenko Yevhen on 07.10.2015.
 */
// мы можем протестировать и конкретную реализацию
// это будет уже интеграционный тест
public class ConcreteClassATest {

    // тут нам мокито не надо :)

    @Test
    public void test() {
        // given

        // нам потребуется дореализовать его анонимно
        AbstractClass object = new ConcreteClassA();

        // when
        // вызываем наш шаблонный метод и передаем тестовые данные
        Object result = object.templateMethod("some_data");

        // then
        // проверяем, что он вернул нам
        assertEquals("algorithm1A plus algorithm4A some_data", result);
    }
}
