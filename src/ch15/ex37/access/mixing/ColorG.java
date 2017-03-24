package ch15.ex37.access.mixing;

/**
 * Created by V1 on 22.03.2017.
 */
public class ColorG<T extends IColor> {
    private T  item;  // поле тип которого интерфейс без реализации

    public ColorG(T item) {
        this.item = item;
    }

    public T  getItem() {
        return item;
    }
}
