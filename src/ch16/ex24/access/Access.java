package ch16.ex24.access;

import lib.generate.Gen;
import lib.utils.IGenerator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static Random rnd = new Random();

    public static IGenerator<Ball> genBall() {
        return new IGenerator<Ball>() {
            @Override
            public Ball next() {
                return new Ball(rnd.nextInt(100));
            }
        };
    }

    private static class CompBall implements Comparator<Ball> {
        @Override
        public int compare(Ball o1, Ball o2) {
            if (o1.getSize() < o2.getSize()) {
                return -1;
            }
            if (o1.getSize() > o2.getSize()) {
                return 1;
            }
            return 0;
        }
    }
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 24 Array Searching Check\n");
        System.out.println("Array Sort:");


        System.out.println("Check Searching:");
        for (int i = 0; i < 5; i++) {
            Ball[] bArray = Gen.getArray(Ball.class, genBall(), 7);
            Ball vBall = bArray[rnd.nextInt(bArray.length)];
            Arrays.sort(bArray,new CompBall());
            int index = Arrays.binarySearch(bArray, vBall,new CompBall());
            System.out.println("search:"+vBall+" : found:"+bArray[index]);

        }
    }
}
