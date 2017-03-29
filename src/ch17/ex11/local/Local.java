package ch17.ex11.local;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nQueue Behaviour Check\n");
        QueueB.check(new LinkedList<>(), new QueueB.Gen());
        QueueB.check(new PriorityQueue<>(), new QueueB.Gen());
        QueueB.check(new ArrayBlockingQueue<>(10), new QueueB.Gen());
        QueueB.check(new ConcurrentLinkedQueue<>(), new QueueB.Gen());
        QueueB.check(new ConcurrentLinkedDeque<>(), new QueueB.Gen());
        QueueB.check(new PriorityBlockingQueue<>(), new QueueB.Gen());


    }
}
