package ch.ex25.thrown;

import java.awt.*;

/**
 * Created by V1 on 18.03.2017.
 */
public class Colored<T extends IColor> extends HoldItem<T> {  // получили конструктор от super
// T item                       // поддерживает теперь интерфейс IColor
    public Colored(T item) {
        super(item);
    }
// shell
// IColor
    Color getColor() {
        System.out.print("Colored.getColor > ");
        return item.getColor();
    }
}
