package ch16.ex19.access;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise Check\n");
        Ball[] aBall = new Ball[10];
        Ball[] bBall = new Ball[10];
        Arrays.fill(aBall,new Ball(12));
        Arrays.fill(bBall,new Ball(12));
        System.out.println("aBall:"+Arrays.toString(aBall));
        System.out.println("bBall:"+Arrays.toString(bBall));

        System.out.println("Arrays.equals():"+Arrays.equals(aBall,bBall));

    }
}
