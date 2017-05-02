package ch21.ex15.codeb;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 02-May-17.
 */
public class CodeB {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\nCritical Section Based on Lock Check\n");
        ExpliciCriticalSection.check();
    }
}
