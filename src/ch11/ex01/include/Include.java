package ch11.ex01.include;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println();
        System.out.println("====INCLUDE====");
        System.out.println("\nCollection Generics with Inheritance Transform Check\n");
        Cargo c = new Cargo();
        c.checkGenerics();
    }
}
