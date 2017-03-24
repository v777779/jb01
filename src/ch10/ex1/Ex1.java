package ch10.ex1;

import ch10.ex1.access.Outer;
import ch10.ex1.local.Parcel1;
import ch10.ex1.local.Parcel2;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("\nInner Class CheckGarden\n");
        Parcel1 p1 = new Parcel1();
        p1.ship("Tanzania");

        System.out.println("\nInner Class CheckGarden\n");
        Parcel1.Contents p1c = p1.getContents();  // получить ссылку на внутренний класс
        Parcel1.Destination p1d = p1.getDestination("Paris");

        System.out.println(p1d.getLabel()+": "+p1c.getValue());

        System.out.println("\nInner Static Class CheckGarden\n");
        System.out.println(Parcel2.getDestination("Toronto").getLabel()+": "+
                           Parcel2.getContents(15).getValue()); // через статический метод

        System.out.println("\nExercise 1 Inner Class CheckGarden\n");
        Outer o = new Outer();
        Outer.Inner ic =  o.getInner();
        ic.getName();
    }
}
