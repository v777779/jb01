package ch08.ex12a;

import ch08.ex12a.local.*;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Ex12a {
    public static void main(String[] args) {
        Singer[] singers = new Singer[] {new Vocal(), new Tenor(), new Soprano()};
        Band band = Band.getBand(singers);
        Band band2 = Band.getBand(singers);
        Band band3 = Band.getBand(singers);

        System.out.println(band);
        System.out.println(band2);
        System.out.println(band3);

        band.dispose();
        System.out.println(band2);
        System.out.println(band3);

        band2.dispose();
        System.out.println(band3);

        band3.dispose();

//        System.out.println("\nReference Counting while Disposal Check\n");
//
//        Shared shared = new Shared(); // отдельный объект
//        Composer[] composers = new Composer[10];
//        for (int i = 0; i < composers.length; i++) {
//            composers[i] = new Composer(shared);  // 10 объектов использует один объект
//        }


    }
}
