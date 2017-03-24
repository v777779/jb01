package ch15.ex05.local;

/**
 * Created by V1 on 15.03.2017.
 */
public class LinkedStack<T> {
    private static class Node<U> {  // Node имя класса  <U> обертка для <T>
        U item;                     // поле данных  Generic <U> == <T>
        Node<U> next;               // ссылка на следующий объект Node<U>

        public Node() {
            item = null;
            next = null;

        }
        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return ((item == null) && (next == null)); // пустой узел
        }
    }// class Node<U>

    private Node<T> top = new Node<>(); // верх стека
    public void push(T item) {
        top = new Node<T>(item,top);
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

