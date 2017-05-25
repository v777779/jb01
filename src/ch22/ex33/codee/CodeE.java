package ch22.ex33.codee;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 24-May-17.
 */
public class CodeE {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====CODE_E===");
        System.out.println("\nSwing Threads and Future Check\n");
        InterruptableLongRunningCallable.check();
    }
}
