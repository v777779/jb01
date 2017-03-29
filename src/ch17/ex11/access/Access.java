package ch17.ex11.access;

import lib.generate.GenList;

import java.util.PriorityQueue;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise Check\n");
        PriorityQueue<Lawn> pq = new PriorityQueue<>(GenList.get(new Lawn(),10));
        while (!pq.isEmpty()) {
            System.out.print(pq.poll()+" ");
        }
        System.out.println();

    }
}
