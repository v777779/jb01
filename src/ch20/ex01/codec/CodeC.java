package ch20.ex01.codec;

import ch20.ex01.codec.dbase.TableCreator;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public class CodeC {
    public static void app(String[] args) {
        System.out.println("\n====CODE_C===");
        System.out.println("\nAnnotation Message Files Check\n");

        TableCreator.check(args);
    }
}
