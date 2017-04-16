package ch18.ex27;

import ch18.ex27.codea.CodeA;
import ch18.ex27.codeb.CodeB;
import ch18.ex27.codec.CodeC;
import ch18.ex27.exercise.Exercise;
import lib.files.BFileClear;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 13-Apr-17.
 */
public class Ex27 {
    public static void main(String[] args) {
        CodeA.app();
        CodeB.app(args);
        CodeC.app();
        Exercise.app();
        BFileClear.app("./src/ch18/ex27", "tmp", "dat");

    }
}
