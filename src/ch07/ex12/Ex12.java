package ch07.ex12;

import ch07.ex12.access.CadSystem;
import ch07.ex12.local.PlaceSetting;
import ch07.ex12.shelf.Stem;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Ex12 {
    public static void main(String[] args) {
        System.out.println("\nAggreggation and Inheritance Check\n");
        PlaceSetting ps = new PlaceSetting(1);

        System.out.println("\nAggreggation and Inheritance Closing Check\n");
        CadSystem cad = new CadSystem(12);
        try {

            System.out.println("\ntry \n");


        }catch (Exception e) {

        }finally{
            cad.dispose();
        }
        System.out.println("\nExercise 12 Aggreggation and Inheritance Closing Check\n");
        Stem stem = new Stem(new int[]{1,7,8});
        try{
            System.out.println("\ntry \n");
        }finally {
            stem.dispose();

        }


    }
}
