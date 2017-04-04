package lib.utils;

import java.util.LinkedList;

/**
 * Created by V1 on 22-Feb-17.
 */
public class SimpleStack<T> {   // вау работаем с Generics
    private LinkedList<T> stack = new LinkedList<T>(); // свой список с определяемым типом

    public void push(T value) {
        stack.addFirst(value);   // добавить в начало
    }

    public T pop() {
        return stack.removeFirst(); // удалить и вернуть из начала
    }

    public T peek() {
        return stack.getFirst(); // вернуть элемент из начала
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public String toString() {
        return stack.toString(); // в строку по умолчанию
    }
}
