package ch.ex7.integra;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nIterable Generic Check\n");
        for (Integer integer : new Fibonacci2(25)) {
            System.out.print(integer+" ");
        }
        System.out.println();
        System.out.println("\nIterable Fibonacci:");
        for (Integer integer : new IterableFibonacci(25)) {
            System.out.print(integer+" ");
        }
        System.out.println();
    }
}
