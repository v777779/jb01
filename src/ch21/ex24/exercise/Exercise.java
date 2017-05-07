package ch21.ex24.exercise;

import ch21.ex24.exercise.office.ProducerConsumer;
import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 07-May-17.
 */
public class Exercise {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 24 Handshaking Check\n");

        Plant.check();
        Time.sleep(1000);
        System.out.println("\nOfficial solution");
        ProducerConsumer.check();


    }
}
