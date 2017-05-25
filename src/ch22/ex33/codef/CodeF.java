package ch22.ex33.codef;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 24-May-17.
 */
public class CodeF {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====CODE_F===");
        System.out.println("\nSwing Threads and Progress Monitor for Callable Task Check\n");
        MonitoredLongRunningCallable.check();
    }
}
