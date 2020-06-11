package collections;


import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class AbstractList<T> extends AbstractCollection<T> implements List<T> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public void add(T element) {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        return false;
    }
}
