package ch18.ex30.exercise.shapes;

import ch18.ex30.exercise.RestoreCadState;
import ch18.ex30.exercise.StoreCADState;

/**
 * Copyright (c) 2017 Vadim Voronov
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
