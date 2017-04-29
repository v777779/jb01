package ch21.ex10.exercise;

import ch21.ex10.exercise.official.ThreadMethod4;
import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 29-Apr-17.
 */
public class Exercise {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 10 Check\n");

        System.out.println("Home solution:");
        ThreadMethod2.check();
        Time.sleep(200);

        System.out.println("\nOfficial solution:");
        ThreadMethod4.check();

        System.out.println("\nTest IGenerator{}:");
        System.out.println("next2:"+ThreadMethod2.gen().next());

        System.out.println("\nTest IGenerator Lambda:");
        System.out.println("next4:"+ThreadMethod2.gen2().next());



    }
}
