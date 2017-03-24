package ch15.ex21.include;

/**
 * Created by V1 on 17.03.2017.
 */
public class GenericBase<T> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void getInfo() {
        System.out.println("element:" + element.getClass().getSimpleName());
    }
}
