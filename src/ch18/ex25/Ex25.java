package ch18.ex25;

import ch18.ex25.codea.CodeA;
import ch18.ex25.codeb.CodeB;
import ch18.ex25.codec.CodeC;
import ch18.ex25.coded.CodeD;
import ch18.ex25.exercise.Exercise;
import lib.files.BFileClear;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 12-Apr-17.
 */
public class Ex25 {
    public static void main(String[] args) {
        CodeA.app();
        CodeB.app();
        CodeC.app();
        CodeD.app();
        Exercise.app();
        BFileClear.app("./src/ch18/ex25","txt","tmp");

    }
}
