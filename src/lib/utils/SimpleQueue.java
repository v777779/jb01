package lib.utils;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by V1 on 22.03.2017.
 */
public class SimpleQueue<T> implements Iterable<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void add(T item) {
        storage.offer(item);
    }

    public T get() {
        return storage.poll();
    }

    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }
}
