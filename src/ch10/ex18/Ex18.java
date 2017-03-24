package ch10.ex18;

import ch10.ex18.local.IContents;
import ch10.ex18.local.IDestination;
import ch10.ex18.local.IEntry;
import ch10.ex18.local.Parcel11;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Ex18 {
    public static void main(String[] args) {
        System.out.println("\nNested Class Check\n");

        IContents c = Parcel11.getClassCont();
        IDestination d = Parcel11.getClassDest("GreenChain");

        IEntry e = d.getEntry();

        System.out.println(c);
        System.out.println(d);
        System.out.println(d.getEntry());


    }
}
