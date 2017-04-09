package ch18.ex12;

import ch18.ex12.classa.ClassA;
import ch18.ex12.classc.ClassC;
import ch18.ex12.exercise.Exercise;
import ch18.ex12.classb.ClassB;

/**
 * Created by V1 on 08-Apr-17.
 */
public class Ex12 {
    public static void main(String[] args) {
        ClassA.app();
        ClassB.app();
        ClassC.app();
        Exercise.app(args);

    }
}
