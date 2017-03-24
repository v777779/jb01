package ch11.ex27.access;

import java.util.Queue;

/**
 * Created by V1 on 27-Feb-17.
 */
public class ProcessQueue {

    public static void processQ(Queue<Command> queue) {
        while (queue.peek() != null) {
            queue.remove().operation();
        }

    }
}
