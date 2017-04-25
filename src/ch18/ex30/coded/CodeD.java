package ch18.ex30.coded;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class CodeD {
    public static void app() {
        System.out.println("\n====CODE_D===");
        System.out.println("\nLongTerm Serialization Check\n");
        StoreCADState.check();
        RestoreCadState.check();
    }
}
