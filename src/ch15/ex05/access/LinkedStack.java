package ch15.ex05.access;

/**
 * Created by V1 on 15.03.2017.
 */
public class LinkedStack<T> {
    private class Node {  // Node имя класса  <U> обертка для <T>
        T item;                     // поле данных  Generic <U> == <T>
        Node next;               // ссылка на следующий объект Node<U>

        public Node() {
            item = null;
            next = null;

        }
        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return ((item == null) && (next == null)); // пустой узел
        }
    }// class Node<U>

    private Node top = new Node(); // верх стека
    public void push(T item) {
        top = new Node(item,top);
    }
    public T pop() {        // удаление ссылок идет автоматом GC
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public boolean empty() {
        return top.end();
    }
}

