package ch.ex21.include;

import lib.pets.Cat;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nErasure Generic Check\n");
        Derived2<Cat> d2 = new Derived2<>();
        try {
            d2.getInfo();
        } catch (Exception e) {
            System.out.println("d2.element: NullPointer Exception");
        }

        GBase2<Cat> g2 = new GBase2<>(new Cat());
        g2.getInfo();

    }
}
