package ua.martynenko.pattern.iterator.sample;

public class LinkedListTest extends ListTest {

    @Override
    protected List<String> getList() {
        return new LinkedList<String>();
    }
}
