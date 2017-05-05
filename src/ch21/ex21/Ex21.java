package ch21.ex21;

import ch21.ex21.codea.CodeA;
import ch21.ex21.codeb.CodeB;
import ch21.ex21.codec.CodeC;
import ch21.ex21.exercise.Exercise;

/**
 * Vadim Voronov
 * Created: 04-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Ex21 {
    public static void main(String[] args) {
        CodeA.app();
        CodeB.app(args);
        CodeC.app();
        Exercise.app();

    }
}
