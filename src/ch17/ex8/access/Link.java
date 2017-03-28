package ch17.ex8.access;

/**
 * Created by V1 on 28-Mar-17.
 */
public class Link<T> {
    private Link next;
    private T value;

    public Link() {
        this.value = null;
    }

    public Link(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Link." + value;
    }
}
