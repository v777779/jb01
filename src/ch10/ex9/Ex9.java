package ch10.ex9;

import ch10.ex9.access.IRecord;
import ch10.ex9.access.Tape;
import ch10.ex9.local.Parcel6;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Ex9 {
    public static void main(String[] args) {
        System.out.println("\nArbitrary Inner Class Placement CheckGarden\n");
        Parcel6 p6 = new Parcel6();
        p6.showInfo(false);
        p6.showInfo(true);


        System.out.println("\nExercise 9 Inner Class Inside Method CheckGarden\n");
        Tape tape = new Tape();
        IRecord record = tape.getTape();   // inner object
        record.play();





    }
}
