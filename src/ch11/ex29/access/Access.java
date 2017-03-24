package ch11.ex29.access;

import java.util.PriorityQueue;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 29 Priority Queue Check\n");
        PriorityQueue<Ball> pq = new PriorityQueue<>();
        pq.add(new Ball());
        pq.add(new Ball());  // не работает, невозможно добавить
        pq.add(new Ball());
        pq.add(new Ball());



    }
}
