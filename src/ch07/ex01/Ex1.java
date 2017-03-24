package ch07.ex01;

import ch07.ex01.local.Bath;
import ch07.ex01.water.SprinklerSystem;
import lib.utils.Range;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Ex1 {
    public static void main(String[] args) {
        Range range = new Range();
        for (int i : Range.rangeInt(25)) {
            System.out.println("i = " + i+" ");
        }
        System.out.println();
        for (float f : Range.rangeFloat(25)) {
            System.out.printf("%04.1f ",f);
        }
        System.out.println();
        System.out.println("\nCheck Aggreggation  \n");
        Plate plate = new Plate();
        plate.show();

        System.out.println("\nWater System \n");
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);

        System.out.println("\nCheck Aggreggation Init \n");
        Bath bath = new Bath();
        System.out.println("bath = \n" + bath);

        System.out.println("\nCheck Aggreggation Postponed Init \n");

        System.out.println("plate = \n" + plate);


    }
}
