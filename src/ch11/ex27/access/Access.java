package ch11.ex27.access;

import java.util.Queue;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 27 Queue Check\n");

        System.out.print("Queue making started:");
        Queue<Command> q = MakeQueue.getQ(10);
        System.out.println("...done");
        System.out.println("Queue processing started:");
        ProcessQueue.processQ(q);
        System.out.println("...done");
    }
}
