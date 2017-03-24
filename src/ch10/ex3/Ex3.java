package ch10.ex3;

import ch10.ex3.access.Outer;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("\nExercise 3 Inner Class CheckGarden\n");
        Outer outer = new Outer("CheckString");
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner);

    }
}
