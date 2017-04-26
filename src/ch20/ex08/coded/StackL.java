package ch20.ex08.coded;

import lib.units.atunit.TestProperty;

import java.util.LinkedList;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class StackL<T> {
    private LinkedList<T> linkedList = new LinkedList<T>();

    @TestProperty
    protected LinkedList<T> get() {  // получить закрытый список
        return linkedList;
    }

    public void push(T v) {
        linkedList.addFirst(v);
    }

    public T pop() {
        return linkedList.removeFirst();
    }

    public T top() {
        return linkedList.getFirst();
    }
}
