package ch18.ex30.coded.shapes;

import ch18.ex30.coded.RestoreCadState;
import ch18.ex30.coded.StoreCADState;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 18-Feb-17.
 */
public class CodeD {
    public static void app() {
        System.out.println("\n====CODE_D===");
        System.out.println("\nLongTerm Serialization Check\n");
        StoreCADState.check();
        RestoreCadState.check();
    }
}
