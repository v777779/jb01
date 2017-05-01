package ch21.ex11.codee;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 29-Apr-17.
 */
public class CodeE {
    public static void app() {
        System.out.println("\n====CODE_E===");
        System.out.println("\nShare Resources Check\n");
        System.out.println("Not Synchronized IntGenerator:");
        EventGenerator.check();

        System.out.println("\nSynchronized IntGenerator:");
        SynchronizedEvenGenerator.check();

    }
}
