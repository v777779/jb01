package ch21.ex39.coded;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 12-May-17.
 */
public class CodeD {
    public static void main(String[] args) {
        app(args);
    }

    public static void app(String[] args) {
        System.out.println("\n====CODE_D===");
        System.out.println("\nSyncronized Containers Performance Check\n");
        ListComparisons.check(args);
    }
}
