package ch11.ex04.integra;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nCollection Print out Check\n");
        Animals a = new Animals();
        System.out.println(a.fill(a.alist));
        System.out.println(a.fill(a.llist));
        System.out.println(a.fill(a.hset));
        System.out.println(a.fill(a.tset));
        System.out.println(a.fill(a.lhset));
        System.out.println(a.fill(a.hmap));
        System.out.println(a.fill(a.lhmap));
        System.out.println(a.fill(a.tmap));



    }
}
