package ch.ex7.include;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nInterface w/Generic Check\n");
        Fibonacci fb = new Fibonacci();
        for (int i = 0; i < 18; i++) {
            System.out.print(fb.next() + " ");
        }
        System.out.println();
    }
}
