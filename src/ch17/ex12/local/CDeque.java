package ch17.ex12.local;

import java.util.LinkedList;

/**
 * Created by V1 on 29-Mar-17.
 */
public class CDeque<T> {
    private LinkedList<T> deque = new LinkedList<T>();

    public void addFirst(T e) {
        deque.addFirst(e);
    }

    public void addLast(T e) {
        deque.addLast(e);
    }

    public T getFirst() {
        return deque.getFirst();
    }

    public T getLast() {
        return deque.getLast();
    }

    public int size() {
        return deque.size();
    }

    public T removeFirst() {
        return deque.removeFirst();
    }

    public T removeLast() {
        return deque.removeLast();
    }

    public static void fill(CDeque<Integer> deque) {
        for (int i = 20; i < 27; i++) {
            deque.addFirst(i);
        }
        for (int i = 50; i < 55; i++) {
            deque.addLast(i);
        }
    }

    @Override
    public String toString() {
        return deque.toString();
    }


}
