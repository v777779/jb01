package ch.ex34.integra;

/**
 * Created by V1 on 21.03.2017.
 */
public class BasicHolder<T> {
    T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    void f() {
        System.out.println(element.getClass().getSimpleName()); // вывести имя класса элемента
    }

}
