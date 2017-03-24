package ch15.ex25.remote;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Remote {
    public static void app() {
        System.out.println("\n====REMOTE===");
        System.out.println("\nBounds of Generic Check\n");
        Solid<Bounded> solid = new Solid<>(new Bounded()); // инициализация
        solid.getColor();
        solid.getWeight();
        solid.getItemY();
        solid.getZ();
    }
}
