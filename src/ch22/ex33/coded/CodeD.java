package ch22.ex33.coded;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 24-May-17.
 */
public class CodeD {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====CODE_D===");
        System.out.println("\nThreads and Swing Check\n");
        InterruptableLongRunningTask.check();
    }
}
