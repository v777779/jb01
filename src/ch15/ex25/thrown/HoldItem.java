package ch15.ex25.thrown;

/**
 * Created by V1 on 18.03.2017.
 */
public class HoldItem<T> {
    T item;   // T поддерживает только Object

    public HoldItem(T item) {
        this.item = item;
    }

    public T getItem() {
        System.out.println("HoldItem.getItem");
        return item;
    }
}
