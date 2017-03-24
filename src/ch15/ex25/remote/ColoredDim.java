package ch15.ex25.remote;

import java.awt.*;

/**
 * Created by V1 on 18.03.2017.
 */
public class ColoredDim<T extends Dimension & IColor> {  // класс обязательно первым, интерфейсы потом
    T item; // объект поддерживает все методы указанных классов и интерфейсов

    public ColoredDim(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

// shell methods
// IColor
    Color getColor() {
        return item.getColor();
    }
// Dimension fields
    int getItemX() {
        return item.x;
    }

    int getItemY() {
        return item.y;
    }

    int getItemZ() {
        return item.z;
    }
}
