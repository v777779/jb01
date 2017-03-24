package ch11.ex28.access;

import lib.utils.Range;
import lib.utils.Show;

import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 28 Priority Queue  Check\n");

        List<Double> list = Range.rangeDoubleList(25); // получить готовый список
        Show.showDbl(list.iterator());
        PriorityQueue<Double> pqDbl = new PriorityQueue<>(list);
        Show.showQDbl(pqDbl);


    }
}
