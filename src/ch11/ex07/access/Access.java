package ch11.ex07.access;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ch11.ex07.access.Ball.getBalls;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise   Check\n");
        Ball[] balls = getBalls(new Ball[10]);          // создать и проинициализировать массив на 10 объектов
        List<Ball> list = new ArrayList<Ball>(Arrays.asList(balls));
        System.out.println("Ball array.done >"+Arrays.toString(balls));    // массив создали
        System.out.println("Ball list.done  >"+list);     // список создали
        List<Ball> sub = list.subList(1,5);
        System.out.println("Ball sublist    >"+sub);
        list.removeAll(sub);
        System.out.println("Ball remove()   >"+list);

    }
}
