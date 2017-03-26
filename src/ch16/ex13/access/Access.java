package ch16.ex13.access;

import lib.generate.GenSeq;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 13 filling String with Chars Check\n");
        String s = "";
        GenSeq.GenChar gchr = new GenSeq.GenChar();
        for (int i = 0; i < 26 ; i++) {
            s += gchr.next();
        }
        System.out.println("s:"+s);

    }
}
