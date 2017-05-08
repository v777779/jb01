package ch21.ex31.codeb;

import ch21.ex31.codeb.sticks2.DLDPhilosophers2;
import ch21.ex31.codeb.sticks3.DLDPhilosophers3;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 08-May-17.
 */
public class CodeB {
    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\nBlocking Check\n");
        System.out.println("Blocking solution with on odd order:");
        DLDPhilosophers2.check();
        System.out.println("\nBlocking solution with on least number first:");
        DLDPhilosophers3.check();
    }
}
