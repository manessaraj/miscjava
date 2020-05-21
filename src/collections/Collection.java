package collections;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public interface Collection<T> extends Iterable<T> {

    int size();

    boolean isEmpty();

    T next();

    void add(T element);

    boolean contains(Object o);

    Iterator<T> iterator();

    boolean containsAll( @NotNull Collection<?> c);
}
