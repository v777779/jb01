package ch18.ex12;

import ch18.ex12.codea.CodeA;
import ch18.ex12.codec.CodeC;
import ch18.ex12.exercise.Exercise;
import ch18.ex12.codeb.CodeB;

/**
 * Created by V1 on 08-Apr-17.
 */
public class Ex12 {
    public static void main(String[] args) {
        CodeA.app();
        CodeB.app();
        CodeC.app();
        Exercise.app(args);

    }
}
