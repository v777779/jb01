package ch19.ex01.exercise;


/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 1 Enum and Switch Check\n");

        System.out.println("Signal.java added : ");
        System.out.println("\"import static ch19.ex01.exercise.Signal.*;\"");
        System.out.println();
        TrafficLight tf = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(tf);
            tf.change();
        }
    }
}
