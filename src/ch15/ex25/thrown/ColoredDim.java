package ch15.ex25.thrown;


/**
 * Created by V1 on 18.03.2017.
 */
public class ColoredDim<T extends Dimension & IColor> extends Colored<T> {
//T item; // добавлено новое ограничение поддержка Dimension
    public ColoredDim(T item) {
        super(item);
    }
//shell

// Dimension
    int getX() {
        System.out.print("ColoredDim.getX > ");
        return item.getX();
    }
    int getY() {
        System.out.print("ColoredDim.getY > ");
        return item.getY();
    }
    int getZ() {
        System.out.print("ColoredDim.getZ > ");
        return item.getZ();
    }

}
