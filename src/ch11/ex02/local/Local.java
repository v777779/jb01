package ch11.ex02.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nCollection Check\n");
        SimpleCollection sc = new SimpleCollection();
        System.out.print("Collection.ArrayList > ");
        sc.checkSimple();
        System.out.print("Collection.LinkedList > ");
        sc.checkLinked();






    }
}
