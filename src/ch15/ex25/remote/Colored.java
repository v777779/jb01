package ch.ex25.remote;

import java.awt.*;

/**
 * Created by V1 on 18.03.2017.
 */
public class Colored<T extends IColor> {  // в классе применяется тип данных <interface>
    T item; // объект обладает интерфейсом IColor

    public Colored(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public Color getItemColor() {  // функция обертка
        return item.getColor();
    }
}
