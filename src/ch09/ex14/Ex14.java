package ch09.ex14;

import ch09.ex14.access.Active;
import ch09.ex14.access.Person;

/**
 * Created by V1 on 13-Feb-17.
 */
public class Ex14 {
    public static void main(String[] args) {
        System.out.println("\nExercise 14 Interface Check\n");
        Person person = new Person();

        Active.iAir(person);    // interface
        Active.iWater(person);
        Active.iGas(person);
        Active.iBuild(person);
        Active.cPerson(person); // class
        Active.cStuff(person);  // base class
    }
}
