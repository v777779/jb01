package ch.ex12;

import ch.ex12.include.Parcel10;
import ch.ex12.include.Parcel7;
import ch.ex12.include.Parcel9;
import ch.ex12.local.CheckGarden;
import ch.ex12.access.Ground;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Ex12 {
    public static void main(String[] args) {
        System.out.println("\nAnonimous Class CheckGarden\n");
        CheckGarden.show();

        System.out.println("\nAnonimous Class Check\n");
        Parcel7 p7 = new Parcel7();
        System.out.println("Contents:15 Anonimous:17 > " + p7.getContents().getValue());

        System.out.println("\nAnonimous Class Final Init Check\n");
        Parcel9 p9 = new Parcel9();
        System.out.println(p9.getContents(77).getValue());  // анонимный класс
        System.out.println(p9.getContents(98).getValue());  // анонимный класс
        System.out.println("\nAnonimous Class Constructor Pseudo Init Check\n");

        Parcel10 p9a = new Parcel10();
        int i = 24;
        System.out.println(p9a.getContents(i++).getValue());
        System.out.println(p9a.getContents(i).getValue());

        System.out.println("\nExercise 12 Inner Class Loop Access Check\n");
        Ground g = new Ground();
        g.newRouter();    // anonymous and External Class
        g.checkRouter();  // anonymous and super


    }
}
