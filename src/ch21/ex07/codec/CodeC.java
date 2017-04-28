package ch21.ex07.codec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 28-Apr-17.
 */
public class CodeC {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====CODE_C===");
        System.out.println("\nThread Factory Check\n");
        DaemonFromFactory.check();
    }
}
