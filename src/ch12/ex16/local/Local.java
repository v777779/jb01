package ch12.ex16.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    private static void f(int i) {
        try {
            System.out.print("Point 1.");
            if (i == 1) {
                return;
            }
            System.out.print("Point 2.");
            if (i == 2) {
                return;
            }
            System.out.print("Point 3.");
            if (i == 3) {
                return;
            }
            System.out.print("Point 4.");
            if (i == 4) {
                return;
            }
        }finally {
            System.out.println("finally");
        }

    }
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nFinally Return  Check\n");
        for (int i = 1; i < 5; i++) {
            f(i);
        }
    }
}
