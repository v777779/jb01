package ch.ex25.thrown;

/**
 * Created by V1 on 18.03.2017.
 */
public class Solid <T extends Dimension & IColor & IWeight> extends ColoredDim<T>{
// T item; // добавлено ограничение  поддержка IWeight
    public Solid(T item) {
        super(item);
    }
// shell
// IWeight
    int getWeight() {
        System.out.print("Solid.getWeight > ");
        return item.getWeight();
    }

}
