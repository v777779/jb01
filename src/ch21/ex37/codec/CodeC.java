package ch21.ex37.codec;

import ch21.ex37.codec.robot.CarBuilder;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 18-Feb-17.
 */
public class CodeC {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====CODE_C===");
        System.out.println("\nCountDownLatch Check\n");
        CarBuilder.check();
    }
}
