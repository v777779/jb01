package ch21.ex37.codeb;

import ch21.ex37.codeb.robot.CarBuilder;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 18-Feb-17.
 */
public class CodeB {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\nCyclicBarrier Check\n");
        CarBuilder.check();
    }
}
