package ch13.ex01.include;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nString vs StringBuilder  Check\n");
//String version
        WithString w = new WithString();
        String [] strings = "StringBuilder is more compact and speed than Strings".split(" ");

        System.out.println(w.implicit(strings));
        System.out.println(w.explicit(strings));

    }
}
