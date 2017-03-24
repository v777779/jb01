package ch13.ex01.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    private String up(String s) {
        return s.toUpperCase();
    }
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nStrings Immutable Check\n");
        String s = "hello";
        String s2 = s.toUpperCase();
        System.out.println(s+" "+s2);


    }
}
