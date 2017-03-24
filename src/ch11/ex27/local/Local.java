package ch11.ex27.local;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void showQ(Queue q) {
        System.out.println("Queue elements:");
        while (q.peek() != null) {
            System.out.print(q.poll()+" "); // первый элемент очереди отдать
        }
        System.out.println();
    }
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nQueue Check\n");
        Queue<Integer> queue = new LinkedList<>();
        Random rnd  = new Random();
        for (int i = 0; i < 10 ; i++) {
            queue.offer(i+1);
        }
        showQ(queue);
        Queue<Character> qc = new LinkedList<>();
        for (char ch : "Brontosaurus".toCharArray()) {
            qc.offer(ch);
        }

        showQ(qc);

    }
}
