package ch.ex15;

import ch.ex15.access.Active;
import ch.ex15.access.Person;

/**
 * Created by V1 on 13-Feb-17.
 */
public class Ex15 {
    public static void main(String[] args) {
        System.out.println("\nExercise 15 Interface Check\n");
        Person person = new Person();

        Active.iAir(person);    // interface
        Active.iWater(person);
        Active.iGas(person);
        Active.iBuild(person);
        Active.cPerson(person); // class
        Active.cStuff(person);  // abstract base class

    }
}
