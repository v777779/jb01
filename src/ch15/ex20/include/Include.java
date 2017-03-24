package ch15.ex20.include;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nErasure Check\n");

        System.out.println("Manupulator:");
        Manipulator<HasF> m = new Manipulator<>(new HasF());
        m.manipulator();

        System.out.println("Manupulator2:");
        Manipulator2<HasF> m2 = new Manipulator2<>(new HasF());
        m2.manipulator();

        System.out.println("Manupulator3:");
        Manipulator3<Bunch> m3 = new Manipulator3<>(new Bunch());

        m3.manipulator();
        System.out.println(m3.getManupulator().getClass().getSimpleName());

    }
}
