package ch15.ex25.thrown;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Thrown {
    public static void app() {
        System.out.println("\n====THROWN===");
        System.out.println("\nBound Hierarchical Check\n");
        System.out.println("HoldItem:");
        HoldItem<Bounded> h = new Solid<>(new Bounded()); // работает
        h.getItem();
        System.out.println("Colored:");
        Colored<Bounded> c = new Colored<>(new Bounded()); // работает
        c.getColor();
        System.out.println("ColoredDim:");
        ColoredDim<Bounded> d = new ColoredDim<>(new Bounded()); // работает
        d.getColor();
        d.getX();
        System.out.println("Solid:");
        Solid<Bounded> s = new Solid<>(new Bounded()); // работает
        s.getColor();
        s.getX();
        s.getWeight();

    }
}
