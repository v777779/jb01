package ch20.ex01;

import ch20.ex01.codea.CodeA;
import ch20.ex01.codeb.CodeB;
import ch20.ex01.codec.CodeC;
import ch20.ex01.exercise.Exercise;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public class Ex01 {
    public static void main(String[] args) {
        CodeA.app();
        CodeB.app();
        CodeC.app(args);
        Exercise.app(args);

    }
}
