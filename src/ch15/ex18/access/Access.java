package ch.ex18.access;

import lib.utils.Generators;
import lib.utils.Range;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static void ocean(BigFish b, SmallFish s) {
        System.out.println(b+" chases a "+s);

    }
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 18 Anonim Class w Generic  Check\n");
        Random rnd = new Random();
        List<BigFish> bList = new ArrayList<>();
        List<SmallFish> sList = new ArrayList<>();

        Generators.fill(bList, BigFish.generator(), 5);
        Generators.fill(sList, SmallFish.generator(), 10);
        for (SmallFish s : sList) {
            BigFish b =bList.get(Range.getInt(bList.size()));
            ocean(b,s);
        }


    }
}
