package ua.martynenko.pattern.iterator.sample;

public class ArrayListTest extends ListTest {

    @Override
    protected List<String> getList() {
        return new ArrayList<String>();
    }
}
